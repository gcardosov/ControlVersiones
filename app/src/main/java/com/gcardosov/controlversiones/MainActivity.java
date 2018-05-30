package com.gcardosov.controlversiones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadUI();

    }

    private void loadUI(){
        //logica para cargar la UI
        TextView tvTiutlo = (TextView) findViewById(R.id.tvTitulo);
        Button btnaccion = (Button) findViewById(R.id.btnaccion);

    }




}
