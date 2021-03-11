package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Preguntas2Activity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox checkbox6,checkbox7,checkbox8,checkbox9,checkbox10,checkbox11,checkbox12;
    private Button finalizarBtn;
    private int puntaje;
    private String registro;
    private String registroAnterior;
    private String registroFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas2);

        checkbox6 = (CheckBox) findViewById(R.id.checkBox6);
        checkbox7 = (CheckBox) findViewById(R.id.checkBox7);
        checkbox8 = (CheckBox) findViewById(R.id.checkBox8);
        checkbox9 = (CheckBox) findViewById(R.id.checkBox9);
        checkbox10 = (CheckBox) findViewById(R.id.checkBox10);
        checkbox11 = (CheckBox) findViewById(R.id.checkBox11);
        checkbox12 = (CheckBox) findViewById(R.id.checkBox12);
        finalizarBtn = findViewById(R.id.finalizarBtn);

        puntaje = getSharedPreferences("puntos", MODE_PRIVATE).getInt("puntaje", 0);
        registro = getSharedPreferences("nombres", MODE_PRIVATE).getString("registro", "no user");

        checkbox6.setOnClickListener(this);
        checkbox7.setOnClickListener(this);
        checkbox8.setOnClickListener(this);
        checkbox9.setOnClickListener(this);
        checkbox10.setOnClickListener(this);
        checkbox11.setOnClickListener(this);
        checkbox12.setOnClickListener(this);
        finalizarBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.finalizarBtn:

                if(checkbox6.isChecked() || checkbox7.isChecked() || checkbox8.isChecked() || checkbox9.isChecked() || checkbox10.isChecked() || checkbox11.isChecked() || checkbox12.isChecked()) {
                    Intent i = new Intent(this, MainActivity.class);
                    startActivity(i);
                    SharedPreferences preferences = getSharedPreferences("nombres", MODE_PRIVATE);

                    registroAnterior = preferences.getString("registroFinal", registroFinal);

                    registroFinal = registroAnterior + ": :" + registro + " Su puntaje es: " + puntaje + "\n";

                    preferences.edit().putString("registroFinal", registroFinal).apply();

                    finish();

                }

                break;
            case R.id.checkBox6:
                checkbox6.isChecked();
                if(checkbox6.isChecked()){
                    puntaje += 4;
                }
                break;
            case R.id.checkBox7:
                checkbox7.isChecked();
                if(checkbox7.isChecked()){
                    puntaje += 4;
                }
                break;
            case R.id.checkBox8:
                checkbox8.isChecked();
                if(checkbox8.isChecked()){
                    puntaje += 4;
                }
                break;
            case R.id.checkBox9:
                checkbox9.isChecked();
                if(checkbox9.isChecked()){
                    puntaje += 4;
                }
                break;
            case R.id.checkBox10:
                checkbox10.isChecked();
                if(checkbox10.isChecked()){
                    puntaje += 4;
                }
                break;
            case R.id.checkBox11:
                checkbox11.isChecked();
                if(checkbox11.isChecked()){
                    puntaje += 4;
                }
                break;
            case R.id.checkBox12:
                checkbox12.isChecked();
                if(checkbox12.isChecked()){
                    puntaje += 4;
                }
                break;

        }

    }
}