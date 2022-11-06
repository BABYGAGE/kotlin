
	 
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
import android.content.Intent;
import android.widget.ImageView;

public class writingdiary_activity extends Activity {

	
	private View _bg__writingdiary_ek2;
	private View rectangle_57;
	private TextView write_anything_;
	private View _rectangle_49_ek2;
	private TextView save_a_diary;
	private View line_5_ek3;
	private View line_6_ek1;
	private View line_7;
	private View line_8_ek1;
	private View line_9_ek1;
	private ImageView cancel_2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.writingdiary);

		
		_bg__writingdiary_ek2 = (View) findViewById(R.id._bg__writingdiary_ek2);
		rectangle_57 = (View) findViewById(R.id.rectangle_57);
		write_anything_ = (TextView) findViewById(R.id.write_anything_);
		_rectangle_49_ek2 = (View) findViewById(R.id._rectangle_49_ek2);
		save_a_diary = (TextView) findViewById(R.id.save_a_diary);
		line_5_ek3 = (View) findViewById(R.id.line_5_ek3);
		line_6_ek1 = (View) findViewById(R.id.line_6_ek1);
		line_7 = (View) findViewById(R.id.line_7);
		line_8_ek1 = (View) findViewById(R.id.line_8_ek1);
		line_9_ek1 = (View) findViewById(R.id.line_9_ek1);
		cancel_2 = (ImageView) findViewById(R.id.cancel_2);
	
		
		_rectangle_49_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), household_ledger_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	