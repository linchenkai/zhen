package com.example.zhenqin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Detail extends Activity {
	private TextView mname;
	private TextView mage;
	private TextView maddress;
	private int i;
	private String []name = new String[]{"��ĳ", "��ĳ", "��ĳ", "��ĳ"};
	private String []age = new String[]{"20��", "21��", "22��", "23��"};
	private String []address = new String[]{"����", "�Ϻ�", "�ɶ�", "����"};
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detail);
		
		mname = (TextView)findViewById(R.id.name);
		mage = (TextView)findViewById(R.id.age);
		maddress = (TextView)findViewById(R.id.address);
		
		/**
		 * �õ���Ϣ
		 */
		
		final Intent intent = getIntent();
		i = intent.getIntExtra("index", 0);
		mname.setText("������" + name[i]);
		mage.setText("����:" + age[i]);
		maddress.setText("��ס��:"+ address[i]);
		
		/**
		 * ʵ���ղع���
		 */
		
		ImageButton collect = (ImageButton)findViewById(R.id.collect);
		collect.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(Detail.this, "�ɹ������ղ�", Toast.LENGTH_SHORT).show();
				
			}
		});
		
		/**
		 * ���ع���
		 */
		
		ImageButton back = (ImageButton)findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setResult(0x717, intent);
				finish();
				
			}
		});
	}

	

}
