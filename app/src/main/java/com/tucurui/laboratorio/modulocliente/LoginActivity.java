package com.tucurui.laboratorio.modulocliente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.GetChars;
import android.view.View;
import android.widget.Button;
import com.tucurui.laboratorio.modulocliente.TabActivity;

public class LoginActivity extends AppCompatActivity {

    private Button logar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logar = findViewById(R.id.id_login_logar);
        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            Intent intent = new Intent(getApplicationContext(), TabActivity.class);
            startActivity(intent);
            }
        });


    }
}

