package com.example.dondeestalistacontactos;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		//Leer del intent FirstActivity
		
		Intent primera=getIntent();
		
		//Identificar los campos con informacion
		final Button boton1	= (Button)findViewById(R.id.button1);
		final Button boton2	= (Button)findViewById(R.id.button2);
		final Button boton3	= (Button)findViewById(R.id.button3);
		final Button boton4	= (Button)findViewById(R.id.button4);
		final Button boton5	= (Button)findViewById(R.id.button5);
		final Button boton6	= (Button)findViewById(R.id.button6);
		
		boton1.setOnClickListener(new devolverLugar(){
			
		});
		boton2.setOnClickListener(new devolverLugar(){
			
		});
		boton3.setOnClickListener(new devolverLugar(){
			
		});
		boton4.setOnClickListener(new devolverLugar(){
	
		});
		boton5.setOnClickListener(new devolverLugar(){
	
		});
		boton6.setOnClickListener(new devolverLugar(){
	
		});
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	class devolverLugar implements Button.OnClickListener{
		public void onClick(View v){
			final Button boton = (Button)findViewById(v.getId());
			Intent devolucion = new Intent();
			//Enviamos la infor a la primera ventana
			devolucion.putExtra("lugar", boton.getText());
			setResult(RESULT_OK,devolucion);
			finish();
		}

		public void setOnClickListener(devolverLugar devolverLugar) {
			// TODO Auto-generated method stub
			
		}
	}
}
