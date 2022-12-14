package com.example.babygage_ocr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import com.example.babygage_ocr.databinding.ActivityHouseholdChartBinding
import com.github.mikephil.charting.components.AxisBase
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.formatter.ValueFormatter
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import java.time.LocalDate
import java.util.*
import kotlin.collections.ArrayList

class HouseholdChartActivity : AppCompatActivity() {

    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var firestore: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding : ActivityHouseholdChartBinding
        binding = ActivityHouseholdChartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth= FirebaseAuth.getInstance()
        val currentUser = firebaseAuth?.currentUser
        firestore= FirebaseFirestore.getInstance()

        var today = LocalDate.now()
        Log.d("ITM","today date : " + today.toString().substring(5,7))

        val entries = ArrayList<BarEntry>()

        var docsize = 0
        firestore.collection("Household_${firebaseAuth.currentUser!!.email.toString()}").get()
                //${firebaseAuth.currentUser!!.email.toString()}
            .addOnSuccessListener { snap ->
                Log.d("ITM","size of document : ${snap.size()}")
                Log.d("ITM","snap : ${snap.metadata}")
                docsize = snap.size()
                for(i :Int in 0..docsize-1) {
//                    Log.d("ITM", "in loop")
                    val docRef = firestore.collection("Household_${firebaseAuth.currentUser!!.email.toString()}")
                        .document("Household_Receipts${i}")
                    docRef.get()
                        .addOnSuccessListener { document ->
                            Log.d("ITM", "document data: ${document.data}")
                            Log.d("ITM","document month : ${document.data?.get("date").toString().substring(4, 6)}")
                            if (document.data?.get("date").toString().substring(4, 6) == today.toString().substring(5,7)) {
                                //today.toString().substring(5,7)
//                                Log.d("ITM","same month")
                                Log.d("ITM", "in this month : ${document.data}")
//                                Log.d("ITM", "document date: ${document.data?.get("date")}")
//                                Log.d("ITM","document month that are same: ${document.data?.get("date").toString().substring(4,6)}")
                                Log.d("ITM","document day : ${document.data?.get("date").toString().substring(6, 8)}")
                                Log.d("ITM","document price : ${document.data?.get("price")}")
//                                Log.d("ITM","${("${document.data?.get("date").toString().substring(6, 8)}"+".2").toFloat()}")
//                                Log.d("ITM",
//                                    document.data?.get("price").toString().toFloat().toString() )

//
                                entries.add(
                                    BarEntry(
                                        ("${
                                            document.data?.get("date").toString()
                                                .substring(6, 8)
                                        }").toFloat(),
                                        "${document.data?.get("price")}".toString()
                                            .toFloat()
                                    )
                                )
                                Log.d("ITM","entries : ${entries[0].x}")

                                entries.sortBy { it.x }
                                Log.d("ITM","entries sortBy x : ${entries}")
                                Log.d("ITM","size : ${entries.size}")
                                if(entries.size>=2) {
                                    for (i:Int in 0..entries.size-1) {
                                        if(entries.size-1>=i+1) {
                                            if ((entries[i].x) == (entries[i + 1].x)) {
                                                var y_sum = entries[i].y + entries[i + 1].y
                                                var x = entries[i].x
                                                Log.d("ITM", "y_sum : $y_sum")
                                                entries.removeAt(i)
                                                entries.removeAt((i))
                                                Log.d("ITM","remove entries : $entries")
                                                entries.add(BarEntry(x, y_sum))
                                                Log.d("ITM","add entries : $entries")
                                            }
                                            else {
                                                continue
                                            }
                                        }
                                        else {
                                            break
                                        }
                                    }
    //                                Log.d("ITM", entries.toString())
                                    var set = BarDataSet(entries,"DataSet") // ???????????? ?????????
                                    Log.d("ITM", set.toString())
    //        set.color = ContextCompat.getColor(applicationContext!!,R.color.design_default_color_primary_dark) // ??? ????????? ??? ??????

                                    val dataSet :ArrayList<IBarDataSet> = ArrayList()
                                    dataSet.add(set)
                                    val data = BarData(dataSet)
                                    data.barWidth = 0.5f //?????? ?????? ??????
                                    binding.barchart.run {
                                        this.data = data //????????? ???????????? data??? ????????????.
                                        setFitBars(true)
                                        invalidate()
                                    }
                                }
                            }
                            else {
                                Log.d("ITM", "not in this month : ${document.data}")
//                                Log.d("ITM", entries.toString())
                            }
                        }
                }
//                Log.d("ITM","out loop")
            }
            .addOnFailureListener { exception ->
                Log.d("ITM", "get failed with ", exception) }



        binding.barchart.run {
            description.isEnabled = false //?????? ?????? ????????? ???????????? description??????. false??? ???????????? ???????????? ??????.
            setMaxVisibleValueCount(31) // ?????? ????????? ????????? ????????? 31?????? ???????????????.
            setPinchZoom(false) // ?????????(?????????????????? ?????? ??? ???????????????) ??????
            setDrawBarShadow(false)//???????????? ?????????
            setDrawGridBackground(false)//???????????? ????????????
            axisLeft.run { //?????? ???. ??? Y?????? ?????? ?????????.
                axisMaximum = 1000000f //100 ????????? ?????? ????????? ?????? 101f??? ???????????? ???????????????
                axisMinimum = 0f // ????????? 0
                granularity = 50f // 50 ???????????? ?????? ???????????? granularity ?????? ??? ?????????.
                //??? ????????? 20f????????? ??? 5?????? ?????? ???????????? ???
                setDrawLabels(true) // ??? ????????? ?????? (0, 50, 100)
                setDrawGridLines(true) //?????? ?????? ??????
                setDrawAxisLine(false) // ??? ????????? ??????
//                axisLineColor = ContextCompat.getColor(context, R.color.colorAxis) // ??? ?????? ??????
//                gridColor = ContextCompat.getColor(context, R.color.colorAxis) // ??? ?????? ?????? ?????? ??????
//                textColor =
//                    ContextCompat.getColor(context, R.color.colorSemi50Black) // ?????? ????????? ?????? ??????
                textSize = 10f //?????? ????????? ??????
            }
            xAxis.run {
                position = XAxis.XAxisPosition.BOTTOM //X?????? ??????????????? ??????.
                granularity = 1f // 1 ???????????? ?????? ??????
                setDrawAxisLine(true) // ??? ??????
                setDrawGridLines(false) // ??????
//                textColor = ContextCompat.getColor(context, R.color.colorSemi70Black) //?????? ??????
                valueFormatter = MyXAxisFormatter() // ??? ?????? ??? ???????????? ??????
                textSize = 9f // ????????? ??????
            }
            axisRight.isEnabled = false // ????????? Y?????? ???????????? ??????.
            setTouchEnabled(false) // ????????? ???????????? ?????? ???????????? ??????
            animateY(1000) // ??????????????? ???????????? ??????????????? ??????
            legend.isEnabled = false //?????? ?????? ??????

        }
    }
    inner class MyXAxisFormatter : ValueFormatter() {
        private val days = arrayOf("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31")
        override fun getAxisLabel(value: Float, axis: AxisBase?): String {
            return days.getOrNull(value.toInt()-1) ?: value.toString()
        }
    }
}