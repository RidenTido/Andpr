package com.Fontactivity;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color; 
import android.graphics.Typeface; 
import android.view.View; 
import android.widget.Button;
import android.widget.TextView; 

public class FontactivityActivity extends Activity {
	 TextView textView; 
	 Button btnFontColor, btnFontStyle, btnIncreaseFont,btnDecreaseFont; 
	 boolean isBold = false, isItalic = false; 
	 int colorIndex = 0; 
	 float fontSize = 24; 
	 int[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.MAGENTA}; 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        textView =(TextView) findViewById(R.id.textView); 
        btnFontColor =(Button) findViewById(R.id.btnFontColor); 
        btnFontStyle =(Button) findViewById(R.id.btnFontStyle); 
        btnIncreaseFont =(Button)findViewById(R.id.btnIncreaseFont); 
        btnDecreaseFont = (Button)findViewById(R.id.btnDecreaseFont); 
        
        btnFontColor.setOnClickListener(new View.OnClickListener() { 
        public void onClick(View v) { 
        textView.setTextColor(colors[colorIndex]); 
        colorIndex = (colorIndex + 1) % colors.length; 
        } 
        }); 
        
        btnFontStyle.setOnClickListener(new View.OnClickListener() { 
        public void onClick(View v) { 
        isBold = !isBold; 
        isItalic = !isItalic; 
        int style = (isBold ? Typeface.BOLD : 0) | 
       (isItalic ? Typeface.ITALIC : 0); 
        textView.setTypeface(Typeface.DEFAULT, style); 
        } 
        }); 
        
        btnIncreaseFont.setOnClickListener(new View.OnClickListener() { 
    
        public void onClick(View v) { 
        fontSize += 2; 
        textView.setTextSize(fontSize); 
        } 
        }); 
        
        btnDecreaseFont.setOnClickListener(new View.OnClickListener() { 

        public void onClick(View v) { 
        if (fontSize > 10) {
        fontSize -= 2; 
        textView.setTextSize(fontSize); 
        } 
        } 
        
        }); 
        } 
       }
