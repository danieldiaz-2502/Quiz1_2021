package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Preguntas1Activity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox checkbox1, checkbox2, checkbox3, checkbox4, checkbox5;
    private Button continuarBtn2;
    public int puntaje = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas1);

        continuarBtn2 = findViewById(R.id.continuarBtn2);
        checkbox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkbox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkbox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkbox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkbox5 = (CheckBox) findViewById(R.id.checkBox5);

        checkbox1.setOnClickListener(this);
        checkbox2.setOnClickListener(this);
        checkbox3.setOnClickListener(this);
        checkbox4.setOnClickListener(this);
        checkbox5.setOnClickListener(this);
        continuarBtn2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.continuarBtn2:
                if (checkbox1.isChecked() || checkbox2.isChecked() || checkbox3.isChecked() || checkbox4.isChecked() || checkbox5.isChecked()) {
                    Intent i = new Intent(this, Preguntas2Activity.class);
                    SharedPreferences preferences = getSharedPreferences("puntos", MODE_PRIVATE);
                    preferences.edit().putInt("puntaje", puntaje).apply();
                    startActivity(i);
                }

                break;
            case R.id.checkBox1:
                checkbox1.isChecked();
                if(checkbox1.isChecked()){
                    puntaje += 3;
                } else {
                    puntaje -= 3;
                }
                break;
            case R.id.checkBox2:
                checkbox2.isChecked();
                if(checkbox2.isChecked()){
                    puntaje += 3;
                } else {
                    puntaje -= 3;
                }
                break;
            case R.id.checkBox3:
                checkbox3.isChecked();
                if(checkbox3.isChecked()){
                    puntaje += 3;
                }else {
                    puntaje -= 3;
                }
                break;
            case R.id.checkBox4:
                checkbox4.isChecked();
                if(checkbox4.isChecked()){
                    puntaje += 3;
                }else {
                    puntaje -= 3;
                }
            case R.id.checkBox5:
                checkbox5.isChecked();
                break;
        }
    }
}