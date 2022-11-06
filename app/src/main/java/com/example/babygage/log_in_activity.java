
	 
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
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

public class log_in_activity extends Activity {

	
	private View _bg__log_in_ek2;
	private View _rectangle_24_ek1;
	private View rectangle_31_ek8;
	private ImageView image_1_ek13;
	private ImageView image_2_ek13;
	private TextView babygage_ek11;
	private TextView log_in_ek3;
	private View line_15_ek2;
	private View rectangle_25_ek1;
	private View rectangle_26;
	private TextView put_your_e_mail__id__ek1;
	private View _rectangle_27;
	private TextView log_in_ek4;
	private TextView sign_up_ek6;
	private TextView find_password;
	private TextView put_your_password_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.log_in);

		
		_bg__log_in_ek2 = (View) findViewById(R.id._bg__log_in_ek2);
		_rectangle_24_ek1 = (View) findViewById(R.id._rectangle_24_ek1);
		rectangle_31_ek8 = (View) findViewById(R.id.rectangle_31_ek8);
		image_1_ek13 = (ImageView) findViewById(R.id.image_1_ek13);
		image_2_ek13 = (ImageView) findViewById(R.id.image_2_ek13);
		babygage_ek11 = (TextView) findViewById(R.id.babygage_ek11);
		log_in_ek3 = (TextView) findViewById(R.id.log_in_ek3);
		line_15_ek2 = (View) findViewById(R.id.line_15_ek2);
		rectangle_25_ek1 = (View) findViewById(R.id.rectangle_25_ek1);
		rectangle_26 = (View) findViewById(R.id.rectangle_26);
		put_your_e_mail__id__ek1 = (TextView) findViewById(R.id.put_your_e_mail__id__ek1);
		_rectangle_27 = (View) findViewById(R.id._rectangle_27);
		log_in_ek4 = (TextView) findViewById(R.id.log_in_ek4);
		sign_up_ek6 = (TextView) findViewById(R.id.sign_up_ek6);
		find_password = (TextView) findViewById(R.id.find_password);
		put_your_password_ek1 = (TextView) findViewById(R.id.put_your_password_ek1);
	
		
		_rectangle_24_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), sign_up_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_27.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), intro_select_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	