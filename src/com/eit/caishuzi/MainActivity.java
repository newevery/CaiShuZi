package com.eit.caishuzi;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	int rand;

	public void go(View view) {
		EditText numb1et = (EditText) findViewById(R.id.numb1_et);
		EditText numb2et = (EditText) findViewById(R.id.numb2_et);
		int numb1 = Integer.parseInt(numb1et.getText().toString());
		int numb2 = Integer.parseInt(numb2et.getText().toString());

		if (numb1 >= numb2) {
			Toast.makeText(this, "第一个数字应该小于第二个", 1).show();
		} else {
			rand = new Random().nextInt(numb2 - numb1) + numb1;
			System.out.println(rand);
		}

		System.out.println(rand);

	}

	public void submit(View view) {
		EditText resEt = (EditText) findViewById(R.id.editText3);
		int res = Integer.parseInt(resEt.getText().toString());
		if (res == rand) {
			Toast.makeText(this, "猜对了", 1).show();
		} else if (res > rand) {
			Toast.makeText(this, "猜大了", 1).show();
		} else {
			Toast.makeText(this, "猜小了", 1).show();

		}
	}

}
