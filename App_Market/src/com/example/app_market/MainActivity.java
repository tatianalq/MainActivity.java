package com.example.app_market;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	 
	//creamos 3 objetos textview
	TextView tottus_enlace;
	TextView plazavea_enlace;
	TextView metro_enlace;
	
	String url_tottus ="http://www.tottus.com.pe/tottus-pe/";
	String url_plazavea="http://www.plazavea.com.pe/principal";
	String url_metro="http://metro.com.pe/";
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//se define la nueva fuente cargandole el fichero
		Typeface myTypeFace=Typeface.createFromAsset(getAssets(),"fonts/Babelfish.ttf");
		
		
		//Se carga en una variable el campo cuyo id=titulo
		TextView title=(TextView)findViewById(R.id.titulo);
		
		//Le aplico el nuevo tipo de letra
		title.setTypeface(myTypeFace);
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	//actividad para la lista de productos
	public void onClick(View view)
	{
		Intent i=new Intent (this,Ventana_1.class);
		startActivity(i);
		
	}
	//actividad para logearse
	
	public void Logeo(View view)
	{
		Intent i=new Intent (this,Login_App.class);
		startActivity(i);
		
	}
	
	
	/*
	 * accesos a als paginas web
	//PARA TOTTUS
			tottus_enlace=(TextView)findViewById(R.id.tottus);
			tottus_enlace.setText(Html.fromHtml("Este texto lleva un"+"<a href>="+url_tottus+">Enlace</a>"));
	//PARA PLAZA VEA
	plazavea_enlace=(TextView)findViewById(R.id.plazavea);
	plazavea_enlace.setText(Html.fromHtml("Este texto lleva un"+"<a href>="+url_plazavea+">Enlace</a>"));
	//PARA METRO
	metro_enlace=(TextView)findViewById(R.id.metro);
	metro_enlace.setText(Html.fromHtml("Este texto lleva un"+"<a href>="+url_metro+">Enlace</a>"));
	
	tottus_enlace.setMovementMethod(LinkMovementMethod.getInstance());
	plazavea_enlace.setMovementMethod(LinkMovementMethod.getInstance());
	metro_enlace.setMovementMethod(LinkMovementMethod.getInstance());*/
	
}
