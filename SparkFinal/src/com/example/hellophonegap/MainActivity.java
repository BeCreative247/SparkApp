package com.example.hellophonegap;

import android.os.Bundle;
import org.apache.cordova.Config;
import org.apache.cordova.DroidGap;
import android.app.Activity; 
import android.view.Menu;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		super.loadUrl(Config.getStartUrl());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the ; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
