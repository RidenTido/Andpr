package com.explicitIndent;



import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.*;



public class ExplicitIndentActivity extends Activity {

	

	Button nxtpage;

	EditText textnxt;

	

    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        

        textnxt = (EditText) findViewById(R.id.nxttext);

        nxtpage = (Button) findViewById(R.id.nxtpage);

        

        nxtpage.setOnClickListener(new View.OnClickListener() {

			

			public void onClick(View arg0) {							

				String text = textnxt.getText().toString();

				

				Intent intent = new Intent(ExplicitIndentActivity.this,SecondActivity.class);

				intent.putExtra("Message", text);

				

				startActivity(intent);

				}

		});

        }

}

2. Activity:
package com.explicitIndent;



import android.app.Activity;

import android.os.Bundle;

import android.widget.*;

import android.content.*;

public class SecondActivity extends Activity  {

	

	TextView receivedText;

	

    public void onCreate(Bundle savedInstanceState) {

	  super.onCreate(savedInstanceState);

	  setContentView(R.layout.secondactivity); 

	  

	  receivedText = (TextView) findViewById(R.id.receive);

	  

	  Intent intent = getIntent();

	  String message = intent.getStringExtra("Message");

	  

	  receivedText.setText(message);

	  

	}

}


