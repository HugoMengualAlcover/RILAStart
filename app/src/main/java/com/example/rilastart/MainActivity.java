package com.example.rilastart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSignUp;
    Button btnLogIn;
    ImageButton btnGoogle;
    ImageButton btnApple;
    TextView lblEntrarSinCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVistas();

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SignUpActivity.class));
            }
        });



    }

    private void inicializarVistas() {
        btnSignUp = findViewById(R.id.btnSignUpMain);
        btnLogIn = findViewById(R.id.btnLoginInMain);
        btnGoogle = findViewById(R.id.btnGoogleMain);
        btnApple = findViewById(R.id.btnAppleMain);
        lblEntrarSinCuenta = findViewById(R.id.lblEntrarSinCuentaMain);
    }
}