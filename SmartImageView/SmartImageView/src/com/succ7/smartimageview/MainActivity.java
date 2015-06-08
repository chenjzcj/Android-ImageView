package com.succ7.smartimageview;

import com.loopj.android.image.SmartImageView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void click(View v) {
		SmartImageView siv = (SmartImageView) findViewById(R.id.siv);
		siv.setImageUrl("http://qzonestyle.gtimg.cn/qzone/space_item/boss_pic/2131_2015_6/1433499085773_937457.jpg");
	}
}
