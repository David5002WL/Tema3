package com.example.a2dam.tema3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {

    public static final String PREFS="Mis preferencias";
    private Button a, b;
    private EditText dia, mes, dinero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (Button)findViewById(R.id.button);
        b = (Button)findViewById(R.id.button2);

        dia = (EditText)findViewById(R.id.textView2);
        mes = (EditText)findViewById(R.id.textView4);
        dinero = (EditText)findViewById(R.id.textView6);


        a.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // Creamos o recuperamos el objeto de preferencias compartidas
                SharedPreferences sp = getSharedPreferences(PREFS,MainActivity.MODE_PRIVATE);

                //Obtenemos un editor para modificar las preferencias
                SharedPreferences.Editor editor = sp.edit();

                //Guardamos nuevos valores
                editor.putString("dia",dia.getText().toString());
                editor.putString("mes",mes.getText().toString());
                editor.putString("dinero",dinero.getText().toString());

                editor.commit();

            }
        });



        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
        Intent i = new Intent(MainActivity.this,SegundaVentana.class);
        startActivity(i);
            }
        });
    }
}
