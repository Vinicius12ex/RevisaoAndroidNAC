package br.com.fiap.revisaoandroidnac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class tela2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        val msg = intent.getStringExtra("param")
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()
    }
}
