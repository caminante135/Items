package com.example.sistemas.items;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    private TextView tv1, tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1= findViewById(R.id.text1);
        tv2=findViewById(R.id.text2);
        String xdato1=getIntent().getStringExtra("Dato1");
        String xdato2=getIntent().getStringExtra("Dato2");
        tv1.setText(xdato1);
        tv2.setText(xdato2);
    }


    public void regresar (View view){

        Intent intento = new Intent(this,MainActivity.class);
        startActivity(intento);

    }
}
