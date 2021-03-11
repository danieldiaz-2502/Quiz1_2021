package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button registrarBtn;
    private TextView personasText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrarBtn = findViewById(R.id.registrarBtn);
        registrarBtn.setOnClickListener(this);
        personasText = findViewById(R.id.personasText);

    }

    @Override
    protected void onResume() {

        super.onResume();
        SharedPreferences preferences = getSharedPreferences("nombres", MODE_PRIVATE);
        String registros = preferences.getString("registroFinal", "no hay");

        String[] lista = registros.split(": :");

        for(int i = 0; i < lista.length; i++){
            personasText.append(lista[i] + "\n");
        }
        personasText.setText(registros);
    }

    public void onClick(View v){

        switch (v.getId()){
            case R.id.registrarBtn:

                Intent i = new Intent(this, RegistroActivity.class);
                startActivity(i);

                break;
        }

    }

}