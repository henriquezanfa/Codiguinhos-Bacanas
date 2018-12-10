

// To animate the app initialization

new Handler().postDelayed(new Runnable() {
	
	@Override
	public void run() {
		Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
		startActivity(homeIntent);
		finish();
	}
}, TIME_TO_START_NEW_ACTIVITY)