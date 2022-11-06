
	 
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

public class sign_up_activity extends Activity {

	
	private View _bg__sign_up_ek2;
	private View rectangle_31_ek6;
	private TextView arrow_back_ek7;
	private ImageView image_1_ek11;
	private ImageView image_2_ek11;
	private TextView babygage_ek9;
	private TextView sign_up_ek3;
	private View line_15;
	private View rectangle_16_ek2;
	private TextView put_your_e_mail__id_;
	private View rectangle_17_ek2;
	private View rectangle_20;
	private TextView put_your_password;
	private TextView put_your_name;
	private View rectangle_21;
	private View _rectangle_23;
	private TextView sign_up_ek4;
	private TextView e_mail_id_;
	private TextView name_ek4;
	private TextView password;
	private TextView put_your_password_again;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_up);

		
		_bg__sign_up_ek2 = (View) findViewById(R.id._bg__sign_up_ek2);
		rectangle_31_ek6 = (View) findViewById(R.id.rectangle_31_ek6);
		arrow_back_ek7 = (TextView) findViewById(R.id.arrow_back_ek7);
		image_1_ek11 = (ImageView) findViewById(R.id.image_1_ek11);
		image_2_ek11 = (ImageView) findViewById(R.id.image_2_ek11);
		babygage_ek9 = (TextView) findViewById(R.id.babygage_ek9);
		sign_up_ek3 = (TextView) findViewById(R.id.sign_up_ek3);
		line_15 = (View) findViewById(R.id.line_15);
		rectangle_16_ek2 = (View) findViewById(R.id.rectangle_16_ek2);
		put_your_e_mail__id_ = (TextView) findViewById(R.id.put_your_e_mail__id_);
		rectangle_17_ek2 = (View) findViewById(R.id.rectangle_17_ek2);
		rectangle_20 = (View) findViewById(R.id.rectangle_20);
		put_your_password = (TextView) findViewById(R.id.put_your_password);
		put_your_name = (TextView) findViewById(R.id.put_your_name);
		rectangle_21 = (View) findViewById(R.id.rectangle_21);
		_rectangle_23 = (View) findViewById(R.id._rectangle_23);
		sign_up_ek4 = (TextView) findViewById(R.id.sign_up_ek4);
		e_mail_id_ = (TextView) findViewById(R.id.e_mail_id_);
		name_ek4 = (TextView) findViewById(R.id.name_ek4);
		password = (TextView) findViewById(R.id.password);
		put_your_password_again = (TextView) findViewById(R.id.put_your_password_again);
	
		
		_rectangle_23.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), successful_sign_up_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	