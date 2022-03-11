package com.project.chekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
private EditText val1, val2;
private CheckBox check1, checkj2;
private TextView respuest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    val1=findViewById(R.id.txtVal1);
    val2=findViewById(R.id.txtVal2);
    check1=findViewById(R.id.cbkRestar);
    checkj2=findViewById(R.id.cbkSumar);
    respuest=findViewById(R.id.txtResultado);

    }

    //método para la función del boton
     public  void  Calcular(View view){
        String valor_1 =val1.getText().toString();
        String valor_2= val2.getText().toString();
        int valor_integer= Integer.parseInt(valor_1);
        int valor2_integer=Integer.parseInt(valor_2);

        String resultado=" ";

        if (checkj2.isChecked()==true){
            int suma = valor_integer + valor2_integer;
            resultado= "La suma es: " + suma + " / ";
        }
        if(check1.isChecked()==true){
            int resta = valor_integer - valor2_integer;
            resultado= resultado + "la Resta es: " + resta;

        }
        respuest.setText(resultado);


     }
}