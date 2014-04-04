package com.example.buckeyesafetyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.os.Build;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
				
//		View v = findViewById(R.id.gpstrackerbutton);
//	    v.setOnClickListener(this);
//	    	    
//	    View v1 = findViewById(R.id.settingsbutton);
//	    v1.setOnClickListener(this);
//	    
//	    View v2 = findViewById(R.id.helpbutton);
//	    v2.setOnClickListener(this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onClick (View view) {
		  
//		  if (view.getId() == R.id.gpstrackerbutton) 
//		  {
//			  Intent myIntent = new Intent(view.getContext(), GpsTrackerActivity.class);
//			  startActivityForResult(myIntent, 0);
//		  }
//		  else if (view.getId() == R.id.settingsbutton) 
//		  {
//			  Intent myIntent = new Intent(view.getContext(), SettingsActivity.class);
//			  startActivityForResult(myIntent, 0);		  
//		  }
//		  else if (view.getId() == R.id.helpbutton) 
//		  {
//			  Intent myIntent = new Intent(view.getContext(), HelpActivity.class);
//			  startActivityForResult(myIntent, 0);
//		  }
		  
	} 

}
