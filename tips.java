/*
	SPLASH SCREEN

	In this case the MainActivity runs some Splash Screen 
	for 3 seconds and then opens the HomeActivity with the
	main code.
*/

package your.pack.name;

import ... 

public CLass MainActivity extends AppCompActivity {

	// Time elapsed in the Splesh Screen
	SPLASH_TIME = 3000; 

	@Override
	protected void onCreate(Bundle saveInstance) {
		super.onCreate(saveInstance);
		setContenteView(R.layout.activity_main);
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class); 
				startActivity(homeIntent);
				finish();
			}
		}, SPLASH_TIME);
	}
}