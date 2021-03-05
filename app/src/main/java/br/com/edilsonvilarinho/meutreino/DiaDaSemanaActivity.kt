package br.com.edilsonvilarinho.meutreino

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.edilsonvilarinho.meutreino.databinding.ActivityDiaDaSemanaBinding

class DiaDaSemanaActivity : AppCompatActivity() {

    private lateinit var bind: ActivityDiaDaSemanaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityDiaDaSemanaBinding.inflate(layoutInflater)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        bind.text.text = message
        supportActionBar?.title = message
        setContentView(bind.root)
    }
}