package com.example.sistemas.items;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edt1, edt2, edt3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.et1);
        edt2 = findViewById(R.id.et2);
        edt3 = findViewById(R.id.txtUrl);
    }
    public  void Enviar (View view){

        Intent intento = new Intent(this, Main2Activity.class);
        intento.putExtra("Dato1",edt1.getText().toString());
        intento.putExtra("Dato2",edt2.getText().toString());
        startActivity(intento);
    }

    public  void Navegar (View view){

        Intent intento = new Intent(this,Main3Activity.class);
        intento.putExtra("URL",edt3.getText().toString());
        startActivity(intento);

    }

}
