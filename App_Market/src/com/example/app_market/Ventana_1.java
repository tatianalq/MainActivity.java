package com.example.app_market;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ventana_1 extends Activity {
TextView texto;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ventana1);
	}
	public void Atras(View view)
	{
		finish();
	}
	

}
