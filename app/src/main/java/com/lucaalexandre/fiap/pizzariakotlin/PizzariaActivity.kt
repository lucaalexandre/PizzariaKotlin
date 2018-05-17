package com.lucaalexandre.fiap.pizzariakotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pizzaria.*

class PizzariaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizzaria)
    }

    fun logar(view: View){

        val login= eLogin.text.toString()
        val senha = eSenha.text.toString()

        if(login =="FIAP" && senha=="123"){
            val intent = Intent(this,PedidoActivity:: class.java)

            intent.putExtra("usuario",login)

            startActivity(intent)
            finish()
        }else{
            Toast.makeText(this,"Usuario ou senha invalidos", Toast.LENGTH_SHORT).show()

        }
    }
}
