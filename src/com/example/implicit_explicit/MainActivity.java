package com.example.implicit_explicit;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class MainActivity extends Activity {
private Button btnClick;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnClick=(Button) findViewById(R.id.btnClick);
		
		OnClickListener listener= new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				/*********** Implicit Intent ************/
				/*Intent intentobj = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ug.elearning.sicsr.ac.in"));
				startActivity(intentobj);
				Code for android manifest =><uses-permission android:name="android.permission.INTERNET" />*/
				
				
				/* Intent intentObj = new Intent(Intent.ACTION_CALL);
				intentObj.setData(Uri.parse("tel:123"));
				startActivity(intentObj);
				Code for android manifest =><uses-permission android:name="android.permission.INTERNET" /> */
				
				/*************Explicit intent**************/
				/*Intent intent = new Intent(getApplicationContext(), Calculator.class);
				startActivity(intent); */
				
				Intent intent= new Intent(getApplicationContext(), Calculator.class);
				intent.putExtra("username","SICSR");
				//OR//
				Bundle bundle = new Bundle();
				bundle.putInt("code",601);
				intent.putExtra("bundlename",bundle);
				startActivity(intent);
			
			
			}
		};
		btnClick.setOnClickListener(listener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
