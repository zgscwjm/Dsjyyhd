package com.lsfb.dsjy.activity;

import com.lsfb.dsjy.R;
import com.lsfb.dsjy.R.id;
import com.lsfb.dsjy.R.layout;
import com.lsfb.dsjy.R.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	}

	
}
