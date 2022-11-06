
	 
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
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class intro_select_activity extends Activity {

	
	private View _bg__intro_select_ek2;
	private View rectangle_3;
	private ImageView image_1_ek1;
	private ImageView image_2_ek1;
	private TextView babygage_ek1;
	private View _rectangle_59;
	private View rectangle_60;
	private TextView household_ledger;
	private ImageView vector;
	private ImageView vector_ek1;
	private TextView financial_audit;
	private TextView hi_ooo__welcome_to_easygage_;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro_select);

		
		_bg__intro_select_ek2 = (View) findViewById(R.id._bg__intro_select_ek2);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		image_1_ek1 = (ImageView) findViewById(R.id.image_1_ek1);
		image_2_ek1 = (ImageView) findViewById(R.id.image_2_ek1);
		babygage_ek1 = (TextView) findViewById(R.id.babygage_ek1);
		_rectangle_59 = (View) findViewById(R.id._rectangle_59);
		rectangle_60 = (View) findViewById(R.id.rectangle_60);
		household_ledger = (TextView) findViewById(R.id.household_ledger);
		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		financial_audit = (TextView) findViewById(R.id.financial_audit);
		hi_ooo__welcome_to_easygage_ = (TextView) findViewById(R.id.hi_ooo__welcome_to_easygage_);
	
		
		_rectangle_59.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), mainpage_household_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	