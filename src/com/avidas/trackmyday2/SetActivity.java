package com.avidas.trackmyday2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SetActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_set);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.set, menu);
		return true;
	}

}
