package com.example.a2dam.tema3;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.a2dam.tema3.MainActivity.PREFS;



public class SegundaVentana extends AppCompatActivity {

    private TextView tvDia, tvMes, tvDinero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_ventana);

        tvDia = (TextView)findViewById(R.id.textView10);
        tvMes = (TextView)findViewById(R.id.textView12);
        tvDinero = (TextView)findViewById(R.id.textView14);


        SharedPreferences sp = getSharedPreferences(PREFS,MODE_PRIVATE);
        String dia = sp.getString("dia","");
        String mes = sp.getString("mes","");
        String dinero = sp.getString("dinero","");

        tvDia.setText(dia);
        tvMes.setText(mes);
        tvDinero.setText(dinero);



    }
}
