package com.game.rowing;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setupViews();
	}
	
	private void setupViews() {
		setContentView(R.layout.splash_activity);
		ImageView splashView = (ImageView) findViewById(R.id.splash_view);
		
		splashView.setBackgroundResource(R.drawable.splash_anim_drawable);
		AnimationDrawable bgAnimation = (AnimationDrawable) splashView.getBackground();
		bgAnimation.start();
		
		Animation fadeAnimation = AnimationUtils.loadAnimation(this, R.anim.splash_fade_anim);
		fadeAnimation.setAnimationListener(new Animation.AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {}
			
			@Override
			public void onAnimationRepeat(Animation animation) {}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				gotoGameActivity();
				finish();
			}
		});
		splashView.startAnimation(fadeAnimation);
	}
	
	private void gotoGameActivity() {
		Intent intent = new Intent(this, GameActivity.class);
		startActivity(intent);
		overridePendingTransition(0, 0);
	}
	
	@Override
	public void onBackPressed() {
		return;
	}
}
