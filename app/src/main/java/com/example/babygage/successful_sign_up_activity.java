
	 
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

public class successful_sign_up_activity extends Activity {

	
	private View _bg__successful_sign_up_ek2;
	private View rectangle_31_ek7;
	private ImageView image_1_ek12;
	private ImageView image_2_ek12;
	private TextView babygage_ek10;
	private TextView sign_up_ek5;
	private View line_15_ek1;
	private View rectangle_10_ek2;
	private View rectangle_24;
	private TextView welcome_to_our__babygage__service__you_can_use_everything_in_our_service_after_log_in_;
	private TextView successful_sign_up_ek3;
	private View _rectangle_25;
	private TextView go_to_log_in_page;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.successful_sign_up);

		
		_bg__successful_sign_up_ek2 = (View) findViewById(R.id._bg__successful_sign_up_ek2);
		rectangle_31_ek7 = (View) findViewById(R.id.rectangle_31_ek7);
		image_1_ek12 = (ImageView) findViewById(R.id.image_1_ek12);
		image_2_ek12 = (ImageView) findViewById(R.id.image_2_ek12);
		babygage_ek10 = (TextView) findViewById(R.id.babygage_ek10);
		sign_up_ek5 = (TextView) findViewById(R.id.sign_up_ek5);
		line_15_ek1 = (View) findViewById(R.id.line_15_ek1);
		rectangle_10_ek2 = (View) findViewById(R.id.rectangle_10_ek2);
		rectangle_24 = (View) findViewById(R.id.rectangle_24);
		welcome_to_our__babygage__service__you_can_use_everything_in_our_service_after_log_in_ = (TextView) findViewById(R.id.welcome_to_our__babygage__service__you_can_use_everything_in_our_service_after_log_in_);
		successful_sign_up_ek3 = (TextView) findViewById(R.id.successful_sign_up_ek3);
		_rectangle_25 = (View) findViewById(R.id._rectangle_25);
		go_to_log_in_page = (TextView) findViewById(R.id.go_to_log_in_page);
	
		
		_rectangle_25.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), log_in_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	