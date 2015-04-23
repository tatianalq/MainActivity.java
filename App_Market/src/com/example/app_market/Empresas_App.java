package com.example.app_market;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Empresas_App extends Activity
{
	ListView lista;
	ArrayAdapter<String> adaptador;
	ArrayList<String> datos;
	
protected void onCreate(Bundle savedInstanceState) {

	super.onCreate(savedInstanceState);
	setContentView(R.layout.empresas);

	datos= new ArrayList<String>();
	llenarLista();
	lista= (ListView) findViewById(R.id.lista_empresas);
	adaptador= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
	lista.setAdapter(adaptador);
	lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View vista, int posicion,
				long arg3) {
			// TODO Auto-generated method stub
			Toast.makeText(getApplication(), ""+(String)((TextView)vista).getText(),Toast.LENGTH_LONG).show();
		}
		
	});
}
private void llenarLista()
{
	datos.add("Tottus");
	datos.add("Metro");
	datos.add("Paza Vea");
}
}