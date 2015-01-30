package com.example.zhenqin;


import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class Register extends Activity{
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		
		EditText username = (EditText)findViewById(R.id.username);
		EditText photonumber = (EditText)findViewById(R.id.photonumber);
		EditText birthday = (EditText)findViewById(R.id.birthday);
		EditText location = (EditText)findViewById(R.id.location);
	}

}