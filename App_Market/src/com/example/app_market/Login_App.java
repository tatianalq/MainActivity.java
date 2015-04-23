package com.example.app_market;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login_App extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

	}
	public void validar_login (View view)
	{
		EditText  txtlogin = (EditText)findViewById(R.id.user);
		EditText txtpass = (EditText)findViewById(R.id.pass);
		
		//Validamos
		if(txtlogin.getText().toString().equals("admin")&& txtpass.getText().toString().equals("password"))
		{
			Intent intent = new Intent(this, Empresas_App.class);
			//intent.putExtra("resultado",txtlogin.getText().toString());
			startActivity(intent);
			
		}
		else{
			Toast.makeText(getBaseContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
		}
		
		
	}
	
}
