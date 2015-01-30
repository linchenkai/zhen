package com.example.zhenqin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity{
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		final EditText username = (EditText)findViewById(R.id.username);
		final EditText password = (EditText)findViewById(R.id.password);
		
		/**
		 * ʵ���������빦��
		 */
		
		Button forget = (Button)findViewById(R.id.forget);
		forget.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent();
				intent.setClass(Login.this, Forget.class);
				startActivity(intent);
				
			}
		});
		
		/**
		 * ��¼����
		 */
		
		Button login = (Button)findViewById(R.id.resign);
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub				
				
				if("".equals(username.getText().toString())){
					Toast.makeText(Login.this, "�������û���", Toast.LENGTH_SHORT).show();					
				}else if("".equals(password.getText().toString())){
					Toast.makeText(Login.this, "����������", Toast.LENGTH_SHORT).show();
				}else{
					final Intent intent = getIntent();
					setResult(0x707, intent);
					finish();
				}
				
			}
		});
	}

}
