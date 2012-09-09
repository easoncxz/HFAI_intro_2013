package com.easoncxz.hfai_intro_2013;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;

public class Frag1 extends SherlockFragment {

	public View onCreateView(LayoutInflater li, ViewGroup vg, Bundle bun) {
		return li.inflate(R.layout.frag1, vg, false);
	}

	public void onActivityCreated(Bundle bun) {
		super.onActivityCreated(bun);
	}
}
