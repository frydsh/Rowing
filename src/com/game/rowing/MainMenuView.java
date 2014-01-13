package com.game.rowing;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;

@SuppressWarnings("deprecation")
public class MainMenuView extends AbsoluteLayout {

	private GameActivity mActivity;
	
	public MainMenuView(GameActivity activity) {
		super(activity);
		mActivity = activity;
		setupViews();
	}

	private void setupViews() {
		LayoutInflater.from(getContext()).inflate(R.layout.main_menu_view, this, true);
		
		ImageView playingGame = (ImageView) findViewById(R.id.playing_game);
		playingGame.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mActivity.gotoView("PlayingGameView");
			}
		});
		
		ImageView choosingBoat = (ImageView) findViewById(R.id.choosing_boat);
		choosingBoat.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mActivity.gotoView("ChoosingBoatView");
			}
		});
		
		ImageView settingSound = (ImageView) findViewById(R.id.setting_sound);
		settingSound.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mActivity.gotoView("SettingSoundView");
			}
		});
		
		ImageView help = (ImageView) findViewById(R.id.help);
		help.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mActivity.gotoView("HelpView");
			}
		});
		
		ImageView about = (ImageView) findViewById(R.id.about);
		about.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mActivity.gotoView("AboutView");
			}
		});
		
		ImageView exit = (ImageView) findViewById(R.id.exit);
		exit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mActivity.exit();
			}
		});
	}
}
