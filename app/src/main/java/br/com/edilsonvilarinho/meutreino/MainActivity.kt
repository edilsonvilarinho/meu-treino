package br.com.edilsonvilarinho.meutreino

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.edilsonvilarinho.meutreino.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        bind.textviewHelloworld.text = "Hello world"
        setContentView(bind.root)
    }
}