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
	private String []name = new String[]{"林某", "陈某", "刘某", "杨某"};
	private String []age = new String[]{"20岁", "21岁", "22岁", "23岁"};
	private String []address = new String[]{"北京", "上海", "成都", "福州"};
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detail);
		
		mname = (TextView)findViewById(R.id.name);
		mage = (TextView)findViewById(R.id.age);
		maddress = (TextView)findViewById(R.id.address);
		
		/**
		 * 得到信息
		 */
		
		final Intent intent = getIntent();
		i = intent.getIntExtra("index", 0);
		mname.setText("姓名：" + name[i]);
		mage.setText("年龄:" + age[i]);
		maddress.setText("居住地:"+ address[i]);
		
		/**
		 * 实现收藏功能
		 */
		
		ImageButton collect = (ImageButton)findViewById(R.id.collect);
		collect.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(Detail.this, "成功加入收藏", Toast.LENGTH_SHORT).show();
				
			}
		});
		
		/**
		 * 返回功能
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
