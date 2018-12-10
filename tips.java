/*
	SPLASH SCREEN

	In this case the MainActivity runs some Splash Screen 
	for 3 seconds and then opens the HomeActivity with the
	main code.
*/

package your.pack.name;

import ... 

public CLass MainActivity extends AppCompActivity {

	// Time elapsed in the Splash Screen
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


/*
	LIST VIEW

	Just putting int because everything is list view
	It's not gonna hurt to see this again 
*/

package your.pack.name;

import ... 

public CLass MainActivity extends AppCompActivity {
 
	@Override
	protected void onCreate(Bundle saveInstance) {
		super.onCreate(saveInstance);
		
		ListView myListView = findViewById(R.id.my_list_view);

		ArrayList<String> myArray = new ArrayList<String>();

		myArray.add("Item 1");
		myArray.add("Item 2");
		myArray.add("Item 3");
		myArray.add("Item 4");

		/*
			Alternatively:
			final ArrayList<String> myArray = new ArrayList<String>(asList("Item 1", "Intem 2", "Item 3", "Item 4"));
		*/		

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myArray);
		/*
			ArrayAdapter receives 3 paremeter: context, layout resource and object to display
			There are several different types of layouts, may worth to search for them 
		*/

		myListView.setAdapter(arrayAdapter);

		mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

				Toast.makeText(getApplicationContext(), myArray.get(i), Toat.LENGTH_LONG).show();

			}
		});
	}
}