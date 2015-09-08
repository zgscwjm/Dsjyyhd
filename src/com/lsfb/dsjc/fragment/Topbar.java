package com.lsfb.dsjc.fragment;

import com.lsfb.dsjy.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Topbar extends Fragment{

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
return		inflater.inflate(R.layout.mtopbar, container, false);
		
	}
}
