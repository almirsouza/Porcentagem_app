package com.example.porcentagem;





import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	EditText edt_valor;
	EditText edt_Percentual;
	EditText edt_Resultado;
	
	Button bt_Calcular;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		edt_valor =  (EditText)findViewById(R.id.edt_valor);
		edt_Percentual =  (EditText)findViewById(R.id.edt_Percentual);
		edt_Resultado =  (EditText)findViewById(R.id.edt_Resultado);
		
		bt_Calcular = (Button)findViewById(R.id.bt_Calcular);
		bt_Calcular.setOnClickListener(Calcular);
		}
	
	
	
View.OnClickListener Calcular = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		
			double resultado,valor,porcentagem;
			
			
			valor = Double.parseDouble(edt_valor.getText().toString());
			porcentagem = Double.parseDouble(edt_Percentual.getText().toString());
			
		
			resultado = valor * porcentagem /100;
			
			edt_Resultado.setText(String.valueOf(resultado+"."+valor));
		
			
		
			
			
			
			
			
			
		}
		
		
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
