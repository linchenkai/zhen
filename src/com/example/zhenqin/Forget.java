package com.example.zhenqin;

import java.util.EmptyStackException;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Forget extends Activity{
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reset);
		
		final EditText phonenumber = (EditText)findViewById(R.id.phonenumber);
		EditText verification_code = (EditText)findViewById(R.id.verification_code);
		
		Button getcode = (Button)findViewById(R.id.get);
		getcode.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(!"".equals(phonenumber.getText().toString())){					
				    Toast.makeText(Forget.this, "验证码已经发送到您手机，请注意接收", Toast.LENGTH_SHORT).show();
				}else{
					Toast.makeText(Forget.this, "请输入手机号", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
		
	}

}
