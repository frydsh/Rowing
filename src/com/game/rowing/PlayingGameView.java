package com.game.rowing;

import android.view.LayoutInflater;
import android.widget.RelativeLayout;

public class PlayingGameView extends RelativeLayout {

	private GameActivity mActivity;
	
	public PlayingGameView(GameActivity activity) {
		super(activity);
		mActivity = activity;
		setupViews();
	}

	private void setupViews() {
		LayoutInflater.from(getContext()).inflate(R.layout.playing_game_view, this, true);
	}
}
