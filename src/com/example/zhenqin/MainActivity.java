package com.example.zhenqin;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {
	private int[] imageId = new int[]{R.drawable.image1,R.drawable.image4,R.drawable.image5,
			R.drawable.image6};
	private int i;	
	private int Code = 0x707;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		GridView gridview=(GridView)findViewById(R.id.gridview1);
		final String[] name = new String[]{"ÁÖÄ³","³ÂÄ³","ÁõÄ³","ÑîÄ³"};
		final String[] age = new String[]{"20Ëê", "21Ëê", "22Ëê", "23Ëê"};
		final String[] address = new String[]{"±±¾©", "ÉÏº£", "³É¶¼", "¸£ÖÝ"};
		List<Map<String,Object>> listItem = new ArrayList<Map<String,Object>>();
		
		for(i = 0;i < imageId.length; i++){
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("image", imageId[i]);
			map.put("name", name[i]);
			map.put("age", age[i]);
			map.put("address", address[i]);
			listItem.add(map);
		}
		
		SimpleAdapter adapter = new SimpleAdapter(this,listItem,
				                                R.layout.item,
				                                new String[]{"name","image","age","address"},
				                                new int[]{R.id.name,R.id.imageview1,
				                                          R.id.age,R.id.address});
		gridview.setAdapter(adapter);
		gridview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int index,
					long arg3) {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent();
				intent.putExtra("index", index);							
				intent.setClass(MainActivity.this, Second.class);
				startActivityForResult(intent, Code);
								
			}
		});
		
		/**
		 * ×¢²á
		 */
		
		Button register = (Button)findViewById(R.id.register);
		register.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(MainActivity.this, Register.class);
				startActivity(intent);
				
			}
		});
		
		/**
		 * µÇÂ¼
		 */
		
		Button login = (Button)findViewById(R.id.login);
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();			
				intent.setClass(MainActivity.this, Login.class);
				startActivityForResult(intent, Code);
				
			}
		});
	}

	

}
