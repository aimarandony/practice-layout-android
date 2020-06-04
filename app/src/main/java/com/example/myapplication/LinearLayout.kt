package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LinearLayout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)

        val txtName = findViewById<TextView>(R.id.txtName)
        val txtLastName = findViewById<TextView>(R.id.txtLastName)
        val txtNumber = findViewById<TextView>(R.id.txtNumber)
        val btnSend = findViewById<Button>(R.id.btnEnviar)
        val btnReset = findViewById<Button>(R.id.btnReset)

        btnSend.setOnClickListener(View.OnClickListener {
            var msg = when {
                (txtName.text.isNullOrEmpty() || txtLastName.text.isNullOrEmpty() ||
                 txtNumber.text.length != 9) -> "Complete sus datos !!"
                else -> "${txtName.text} ${txtLastName.text} su número es ${txtNumber.text}"
            }
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        })
    }

}

