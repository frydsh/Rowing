package com.game.rowing;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class AboutView extends RelativeLayout {

	private GameActivity mActivity;
	
	public AboutView(GameActivity activity) {
		super(activity);
		mActivity = activity;
		setupViews();
	}

	private void setupViews() {
		LayoutInflater.from(getContext()).inflate(R.layout.about_view, this, true);
		
		ImageView back = (ImageView) findViewById(R.id.back);
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mActivity.closeView(AboutView.this);
			}
		});
	}
}
