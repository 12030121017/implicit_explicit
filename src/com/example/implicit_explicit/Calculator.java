package com.example.implicit_explicit;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends Activity {
	private Button btn1;
	private TextView eT1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
		//to retrieve string
		String passedString=getIntent().getStringExtra("username");
		//to retrieve bundle and values inside the bundle
		int code=getIntent().getExtras().getInt("code");
		eT1=(TextView) findViewById(R.id.eT1);
		eT1.setText(passedString);
		btn1=(Button) findViewById(R.id.btn1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculator, menu);
		return true;
	}

}
