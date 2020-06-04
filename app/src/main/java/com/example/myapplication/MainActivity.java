package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button btnSaludar;
    private TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSaludar = findViewById(R.id.btnSaludar);
        txtName = findViewById(R.id.txtName);
    }

    public void verSaludo(View view){
        String name = txtName.getText().toString();
        String msg = (name.trim().isEmpty()) ? "No se econtró un nombre!!" : name + "! que tal?";
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
