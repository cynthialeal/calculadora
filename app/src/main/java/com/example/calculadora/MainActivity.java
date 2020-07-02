package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private String numero = "";
    private double num1 = 0;
    private double num2 = 0;
    private String Symbol = "";

    private TextView resultado;
    private Button num_0, num_1, num_2, num_3, num_4, num_5, num_6, num_7, num_8, num_9;
    private Button Resta, Suma, Division, Multiplicacion, Igual, Limpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.solucion);
        num_0 = findViewById(R.id.num_cero);
        num_1 = findViewById(R.id.num_uno);
        num_2 = findViewById(R.id.num_dos);
        num_3 = findViewById(R.id.num_tres);
        num_4 = findViewById(R.id.num_cuatro);
        num_5 = findViewById(R.id.num_cinco);
        num_6 = findViewById(R.id.num_seis);
        num_7 = findViewById(R.id.num_siete);
        num_8 = findViewById(R.id.num_ocho);
        num_9 = findViewById(R.id.num_nueve);

        Resta = findViewById(R.id.resta);
        Suma = findViewById(R.id.suma);
        Division = findViewById(R.id.div);
        Multiplicacion = findViewById(R.id.multi);
        Igual = findViewById(R.id.igual);
        Limpiar = findViewById(R.id.limpiar);

        num_0.setOnClickListener(this);
        num_1.setOnClickListener(this);
        num_2.setOnClickListener(this);
        num_3.setOnClickListener(this);
        num_4.setOnClickListener(this);
        num_5.setOnClickListener(this);
        num_6.setOnClickListener(this);
        num_7.setOnClickListener(this);
        num_8.setOnClickListener(this);
        num_9.setOnClickListener(this);

        Resta.setOnClickListener(this);
        Suma.setOnClickListener(this);
        Division.setOnClickListener(this);
        Multiplicacion.setOnClickListener(this);
        Igual.setOnClickListener(this);
        Limpiar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.num_cero:
                numero = numero + "0";
                resultado.setText(numero);
                break;
            case R.id.num_uno:
                numero = numero + "1";
                resultado.setText(numero);
                break;
            case R.id.num_dos:
                numero = numero + "2";
                resultado.setText(numero);
                break;
            case R.id.num_tres:
                numero = numero + "3";
                resultado.setText(numero);
                break;
            case R.id.num_cuatro:
                numero = numero + "4";
                resultado.setText(numero);
                break;
            case R.id.num_cinco:
                numero = numero + "5";
                resultado.setText(numero);
                break;
            case R.id.num_seis:
                numero = numero + "6";
                resultado.setText(numero);
                break;
            case R.id.num_siete:
                numero = numero + "7";
                resultado.setText(numero);
                break;
            case R.id.num_ocho:
                numero = numero + "8";
                resultado.setText(numero);
                break;
            case R.id.num_nueve:
                numero = numero + "9";
                resultado.setText(numero);
                break;

            case R.id.resta:
                Symbol = "-";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.suma:
                Symbol = "+";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.multi:
                Symbol = "*";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.div:
                Symbol = "/";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.limpiar:
                Symbol = "";
                numero = "";
                num1 = 0;
                num2 = 0;
                resultado.setText("");
                break;
            case R.id.igual:
                num2 = Integer.parseInt(numero);
                switch (Symbol) {
                    case "-":
                        resultado.setText(" resultado = " + (num1 - num2));
                        break;
                    case "+":
                        resultado.setText(" resultado = " + (num1 + num2));
                        break;
                    case "*":
                        resultado.setText(" resultado = " + (num1 * num2));
                        break;
                    case "/":
                        resultado.setText(" resultado = " + (num1 / num2));
                        break;

                }

                num1 = 0;
                num2 = 0;
                numero = "";
                break;




        }


    }

}
