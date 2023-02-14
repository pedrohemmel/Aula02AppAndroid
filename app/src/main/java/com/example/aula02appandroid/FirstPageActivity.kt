package com.example.aula02appandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FirstPageActivity : AppCompatActivity() {

    //MARK: - Global variables


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        print("ola")
        val txtField: EditText = findViewById(R.id.meuTxtField)
        var btn: Button = findViewById(R.id.meuButao)
        var txtView: TextView = findViewById(R.id.meuTxtView)

        val txtFieldValor1: EditText = findViewById(R.id.txtFieldValor1)
        val txtFieldValor2: EditText = findViewById(R.id.txtFieldValor2)
        val btnSomar: Button = findViewById(R.id.btnSomar)

        btn.setOnClickListener {
            txtView.setText(txtField.text)
        }

        btnSomar.setOnClickListener {
            txtView.setText("${txtFieldValor1.text.toString().toInt() + txtFieldValor2.text.toString().toInt()}")
        }
    }
}