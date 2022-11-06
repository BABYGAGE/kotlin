
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		intro
	 *	@date 		Sunday 06th of November 2022 09:05:16 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.babygage;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class takepicture_activity extends Activity {

	
	private View _bg__takepicture_ek2;
	private View rectangle_1_ek7;
	private TextView person_outline_ek7;
	private ImageView vector_ek52;
	private ImageView vector_ek53;
	private TextView mypage_ek7;
	private TextView household_ledger_ek12;
	private TextView financial_audit_ek17;
	private TextView settings_ek7;
	private ImageView vector_ek54;
	private View ellipse_1_ek7;
	private View ellipse_2_ek7;
	private View _ellipse_3_ek7;
	private TextView click_;
	private ImageView image_5_ek2;
	private View line_3_ek5;
	private View line_4_ek4;
	private View line_3_ek6;
	private View line_4_ek5;
	private View line_3_ek7;
	private View line_4_ek6;
	private View line_3_ek8;
	private View line_4_ek7;
	private View line_3_ek9;
	private View line_4_ek8;
	private View rectangle_15_ek1;
	private TextView take_a_picture_ek1;
	private View rectangle_31_ek9;
	private ImageView image_1_ek14;
	private ImageView image_2_ek14;
	private TextView easygage_ek2;
	private ImageView vector_ek55;
	private View rectangle_32;
	private TextView arrow_back_ek8;
	private ImageView image_1_ek15;
	private ImageView image_2_ek15;
	private TextView babygage_ek12;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.takepicture);

		
		_bg__takepicture_ek2 = (View) findViewById(R.id._bg__takepicture_ek2);
		rectangle_1_ek7 = (View) findViewById(R.id.rectangle_1_ek7);
		person_outline_ek7 = (TextView) findViewById(R.id.person_outline_ek7);
		vector_ek52 = (ImageView) findViewById(R.id.vector_ek52);
		vector_ek53 = (ImageView) findViewById(R.id.vector_ek53);
		mypage_ek7 = (TextView) findViewById(R.id.mypage_ek7);
		household_ledger_ek12 = (TextView) findViewById(R.id.household_ledger_ek12);
		financial_audit_ek17 = (TextView) findViewById(R.id.financial_audit_ek17);
		settings_ek7 = (TextView) findViewById(R.id.settings_ek7);
		vector_ek54 = (ImageView) findViewById(R.id.vector_ek54);
		ellipse_1_ek7 = (View) findViewById(R.id.ellipse_1_ek7);
		ellipse_2_ek7 = (View) findViewById(R.id.ellipse_2_ek7);
		_ellipse_3_ek7 = (View) findViewById(R.id._ellipse_3_ek7);
		click_ = (TextView) findViewById(R.id.click_);
		image_5_ek2 = (ImageView) findViewById(R.id.image_5_ek2);
		line_3_ek5 = (View) findViewById(R.id.line_3_ek5);
		line_4_ek4 = (View) findViewById(R.id.line_4_ek4);
		line_3_ek6 = (View) findViewById(R.id.line_3_ek6);
		line_4_ek5 = (View) findViewById(R.id.line_4_ek5);
		line_3_ek7 = (View) findViewById(R.id.line_3_ek7);
		line_4_ek6 = (View) findViewById(R.id.line_4_ek6);
		line_3_ek8 = (View) findViewById(R.id.line_3_ek8);
		line_4_ek7 = (View) findViewById(R.id.line_4_ek7);
		line_3_ek9 = (View) findViewById(R.id.line_3_ek9);
		line_4_ek8 = (View) findViewById(R.id.line_4_ek8);
		rectangle_15_ek1 = (View) findViewById(R.id.rectangle_15_ek1);
		take_a_picture_ek1 = (TextView) findViewById(R.id.take_a_picture_ek1);
		rectangle_31_ek9 = (View) findViewById(R.id.rectangle_31_ek9);
		image_1_ek14 = (ImageView) findViewById(R.id.image_1_ek14);
		image_2_ek14 = (ImageView) findViewById(R.id.image_2_ek14);
		easygage_ek2 = (TextView) findViewById(R.id.easygage_ek2);
		vector_ek55 = (ImageView) findViewById(R.id.vector_ek55);
		rectangle_32 = (View) findViewById(R.id.rectangle_32);
		arrow_back_ek8 = (TextView) findViewById(R.id.arrow_back_ek8);
		image_1_ek15 = (ImageView) findViewById(R.id.image_1_ek15);
		image_2_ek15 = (ImageView) findViewById(R.id.image_2_ek15);
		babygage_ek12 = (TextView) findViewById(R.id.babygage_ek12);
	
		
		_ellipse_3_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), receipt_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	