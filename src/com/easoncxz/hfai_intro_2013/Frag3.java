package com.easoncxz.hfai_intro_2013;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragment;

public class Frag3 extends SherlockFragment {
	public View onCreateView(LayoutInflater li, ViewGroup vg, Bundle bun) {
		return li.inflate(R.layout.frag3, vg, false);
	}

	public void onActivityCreated(Bundle bun) {
		super.onActivityCreated(bun);
		String[] arr = this.getActivity().getResources()
				.getStringArray(R.array.c3p3_arr);
		TextView tv;
		LinearLayout ll = (LinearLayout) this.getActivity().findViewById(
				R.id.listFrame);

		for (int i = 0; i < arr.length; i++) {
			tv = new TextView(this.getActivity().getApplicationContext());
			tv.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
					LayoutParams.WRAP_CONTENT));
			tv.setText(" - "+arr[i]);
			tv.setTextColor(this.getResources().getColorStateList(
					R.color.achievement_list));
			ll.addView(tv);
		}
	}
}
