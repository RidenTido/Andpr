package com.implicit;



import android.app.Activity;

import android.content.Intent;

import android.view.View;

import android.widget.*;

import android.net.Uri;

import android.os.Bundle;



public class Implicit_intentActivity extends Activity {

	

	Button call;

	

    /** Called when the activity is first created. */

    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        

        call = (Button)findViewById(R.id.call);

        

        call.setOnClickListener(new View.OnClickListener() {

			

			public void onClick(View arg0) {

				Intent intent = new Intent(Intent.ACTION_DIAL);

				

				intent.setData(Uri.parse("tel:7550372558"));

				startActivity(intent);

			}

		});

            }

}

