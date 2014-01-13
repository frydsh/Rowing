package com.game.rowing;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class HelpView extends RelativeLayout {

	private GameActivity mActivity;
	private int mCurrentPage;
	private ImageView mBackOrPre;
	private ImageView mBackOrNext;
	private ImageView mBackground;
	private ImageView mMarker;
	
	private static final int[] background_resources = {
		R.drawable.help_background0,
		R.drawable.help_background1,
		R.drawable.help_background2,
		R.drawable.help_background3,
		R.drawable.help_background4,
	};
	
	private static final int[] marker_resources = {
		R.drawable.help_marker0,
		R.drawable.help_marker1,
		R.drawable.help_marker2,
		R.drawable.help_marker3,
		R.drawable.help_marker4,
	};
	
	public HelpView(GameActivity activity) {
		super(activity);
		mActivity = activity;
		setupViews();
		gotoPage(0);
	}

	private void setupViews() {
		LayoutInflater.from(getContext()).inflate(R.layout.help_view, this, true);
		
		mBackground = (ImageView) findViewById(R.id.background);
		mMarker = (ImageView) findViewById(R.id.marker);
		
		mBackOrPre = (ImageView) findViewById(R.id.back_or_pre);
		mBackOrPre.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				gotoPage(--mCurrentPage);
			}
		});
		
		mBackOrNext = (ImageView) findViewById(R.id.back_or_next);
		mBackOrNext.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				gotoPage(++mCurrentPage);
			}
		});
	}
	
	private void gotoPage(int index) {
		if (index < 0 || index > 4) {
			mActivity.closeView(this);
			return;
		}
		mCurrentPage = index;
		
		if (index == 0) {
			mBackOrPre.setImageResource(R.drawable.btn_back_selector);
			mBackOrNext.setImageResource(R.drawable.btn_next_page_selector);
		} else if (index == 4) {
			mBackOrPre.setImageResource(R.drawable.btn_pre_page_selector);
			mBackOrNext.setImageResource(R.drawable.btn_back_selector);
		} else {
			mBackOrPre.setImageResource(R.drawable.btn_pre_page_selector);
			mBackOrNext.setImageResource(R.drawable.btn_next_page_selector);
		}
		
		mBackground.setImageResource(background_resources[index]);
		mMarker.setImageResource(marker_resources[index]);
	}
}
