package com.easoncxz.hfai_intro_2013;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.actionbarsherlock.app.SherlockFragment;

public class Frag4 extends SherlockFragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle bun) {
		return inflater.inflate(R.layout.frag4, container, false);
	}
	
	public void onStart(){
		super.onStart();
		WebView myWebView = (WebView) this.getActivity().findViewById(
				R.id.frag4_webView);
		myWebView.loadUrl("http://ai.hsfz.info/join");
	}
}
