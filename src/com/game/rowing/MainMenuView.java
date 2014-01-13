package com.game.rowing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.TranslateAnimation;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;

@SuppressWarnings("deprecation")
public class MainMenuView extends AbsoluteLayout {

	public MainMenuView(Context context) {
		super(context);
		setupViews();
	}

	private void setupViews() {
		AnimationSet set = new AnimationSet(true);

        Animation animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(50);
        set.addAnimation(animation);

        animation = new TranslateAnimation(
            Animation.RELATIVE_TO_SELF, -120.0f,Animation.RELATIVE_TO_SELF, 120.0f,
            Animation.RELATIVE_TO_SELF, -1.0f,Animation.RELATIVE_TO_SELF, 0.0f
        );
        animation.setDuration(100);
        set.addAnimation(animation);

        LayoutAnimationController controller = new LayoutAnimationController(set, 0.5f);       
        setLayoutAnimation(controller);
        
		LayoutInflater.from(getContext()).inflate(R.layout.main_menu_view, this, true);
		
		ImageView playingGame = (ImageView) findViewById(R.id.playing_game);
		playingGame.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
		
		ImageView choosingBoat = (ImageView) findViewById(R.id.choosing_boat);
		choosingBoat.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
		
		ImageView settingSound = (ImageView) findViewById(R.id.setting_sound);
		settingSound.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
		
		ImageView help = (ImageView) findViewById(R.id.help);
		help.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
		
		ImageView about = (ImageView) findViewById(R.id.about);
		about.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
		
		ImageView exit = (ImageView) findViewById(R.id.exit);
		exit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
		
		startLayoutAnimation();
	}
}
