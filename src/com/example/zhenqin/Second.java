package com.example.zhenqin;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class Second extends Activity{
	private ImageView imageview;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private int i;
	private int CODE = 0x717;
	private int[] imageId = new int[]{R.drawable.image1, R.drawable.image4, 
			R.drawable.image5, R.drawable.image6};
	private String[] name = new String[]{"林某", "陈某", "刘某", "杨某"};
	private String[] age =new String[]{"20岁", "21岁", "22岁", "23岁"};
	private String[] address = new String[]{"北京", "上海", "成都", "福州"};
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		imageview = (ImageView)findViewById(R.id.imageview1);
		textview1 = (TextView)findViewById(R.id.textview1);
		textview2 = (TextView)findViewById(R.id.textview2);
		textview3 = (TextView)findViewById(R.id.textview3);
		
		/**
		 * 得到图片等信息		
		 */
		
		final Intent intent = getIntent();
		i = intent.getIntExtra("index", 0);
		imageview.setImageResource(imageId[i]);		
		textview1.setText("姓名：" + name[i]);
		textview2.setText("年龄：" + age[i]);
		textview3.setText("居住地：" + address[i]);
		
		/**
		 * 返回功能
		 */
					
		ImageButton back = (ImageButton)findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setResult(0x707, intent);
				finish();
				
			}
		});
		
		/**
		 * 查看详情页
		 */
		
		Button detail = (Button)findViewById(R.id.detail);
		detail.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
								
				Intent intent = new Intent();
				intent.putExtra("index", i);
				intent.setClass(Second.this, Detail.class);
				startActivityForResult(intent, CODE);
				
			}
		});
	}

}
