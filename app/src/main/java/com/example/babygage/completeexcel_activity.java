
	 
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

public class completeexcel_activity extends Activity {

	
	private View _bg__completeexcel_ek2;
	private View rectangle_57_ek2;
	private TextView converted_to_excel_file_;
	private View _rectangle_49_ek3;
	private TextView ok;
	private ImageView cancel_1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.completeexcel);

		
		_bg__completeexcel_ek2 = (View) findViewById(R.id._bg__completeexcel_ek2);
		rectangle_57_ek2 = (View) findViewById(R.id.rectangle_57_ek2);
		converted_to_excel_file_ = (TextView) findViewById(R.id.converted_to_excel_file_);
		_rectangle_49_ek3 = (View) findViewById(R.id._rectangle_49_ek3);
		ok = (TextView) findViewById(R.id.ok);
		cancel_1 = (ImageView) findViewById(R.id.cancel_1);
	
		
		_rectangle_49_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), financial_audit_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	