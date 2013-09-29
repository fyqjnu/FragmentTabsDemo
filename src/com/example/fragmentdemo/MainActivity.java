package com.example.fragmentdemo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {
	
	private FragmentTabHost tabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		
		tabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
		
		tabHost.addTab(tabHost.newTabSpec("a").setIndicator("a"), Frag1.class, null);
		tabHost.addTab(tabHost.newTabSpec("b").setIndicator("b"), Frag2.class, null);
		tabHost.addTab(tabHost.newTabSpec("c").setIndicator("c"), Frag3.class, null);
		tabHost.addTab(tabHost.newTabSpec("d").setIndicator("d"), Frag4.class, null);
		
		View tabs = tabHost.findViewById(android.R.id.tabs);
		System.out.println("tabs= " + tabs);
		
		
		SharedPreferences sp = getSharedPreferences("sp", 0);
		int a = sp.getInt("a", -1);
		System.out.println("a=" + a);
		
		sp.edit().putInt("a", 2).commit();
		
	}


}
