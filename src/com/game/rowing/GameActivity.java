package com.game.rowing;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class GameActivity extends Activity {

	private ArrayList<View> mViews = new ArrayList<View>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		gotoView("MainMenuView");
	}
	
	public void gotoView(String name) {
		View view = null;
		if ("MainMenuView".equals(name)) {
			view = new MainMenuView(this);
		} else if ("PlayingGameView".equals(name)) {
			view = new PlayingGameView(this);
		} else if ("ChoosingBoatView".equals(name)) {
			view = new ChoosingBoatView(this);
		} else if ("SettingSoundView".equals(name)) {
			view = new SettingSoundView(this);
		} else if ("HelpView".equals(name)) {
			view = new HelpView(this);
		} else if ("AboutView".equals(name)) {
			view = new AboutView(this);
		}
		assert (view != null);
		mViews.add(view);
		setContentView(view);
	}
	
	public void closeView(View view) {
		assert (mViews.size() > 1);
		View lastView = mViews.get(mViews.size() - 1);
		assert (lastView == view);
		mViews.remove(view);
		lastView = mViews.get(mViews.size() - 1);
		setContentView(lastView);
	}
	
	@Override
	public void onBackPressed() {
		assert (mViews.size() > 0);
		if (mViews.size() == 1) {			
			super.onBackPressed();
		} else {
			closeView(mViews.get(mViews.size() - 1));
		}
	}
	
	public void exit() {
		finish();
	}
}
