package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistroActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText nombreEdit;
    private EditText identiEdit;

    private Button continuarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

      nombreEdit = findViewById(R.id.nombreEdit);
      identiEdit = findViewById(R.id.identiEdit);
      continuarBtn = findViewById(R.id.continuarBtn);

      continuarBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.continuarBtn:
                Intent i = new Intent(this,Preguntas1Activity.class);
                String username = nombreEdit.getText().toString();
                String userid = identiEdit.getText().toString();
                SharedPreferences preferences = getSharedPreferences("nombres",MODE_PRIVATE);

                String registro = username + " " + userid;

                preferences.edit().putString("registro",registro).apply();

                startActivity(i);
            break;
        }
    }
}