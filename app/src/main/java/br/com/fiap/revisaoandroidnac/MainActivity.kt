package br.com.fiap.revisaoandroidnac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_tela2.setOnClickListener(){
            val intent = Intent("TELA2")
            intent.putExtra("param","ola, tela 2!")
            startActivity(intent)
        }
    }
}
