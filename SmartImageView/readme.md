	  <com.loopj.android.image.SmartImageView
	        android:id="@+id/siv"
	        android:src="@drawable/ic_launcher"
	        android:layout_width="wrap_content"
	        android:layout_height="wrap_content" />

直接作为控件使用,可以加载网络图片的一个自定义控件.

	SmartImageView siv = (SmartImageView) findViewById(R.id.siv);
			siv.setImageUrl("http://url.../xxx.jpg");