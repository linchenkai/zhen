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
	private String[] name = new String[]{"��ĳ", "��ĳ", "��ĳ", "��ĳ"};
	private String[] age =new String[]{"20��", "21��", "22��", "23��"};
	private String[] address = new String[]{"����", "�Ϻ�", "�ɶ�", "����"};
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		imageview = (ImageView)findViewById(R.id.imageview1);
		textview1 = (TextView)findViewById(R.id.textview1);
		textview2 = (TextView)findViewById(R.id.textview2);
		textview3 = (TextView)findViewById(R.id.textview3);
		
		/**
		 * �õ�ͼƬ����Ϣ		
		 */
		
		final Intent intent = getIntent();
		i = intent.getIntExtra("index", 0);
		imageview.setImageResource(imageId[i]);		
		textview1.setText("������" + name[i]);
		textview2.setText("���䣺" + age[i]);
		textview3.setText("��ס�أ�" + address[i]);
		
		/**
		 * ���ع���
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
		 * �鿴����ҳ
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
