package br.com.edilsonvilarinho.meutreino

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.edilsonvilarinho.meutreino.databinding.ActivityMainBinding

const val EXTRA_MESSAGE = "MESSAGE"

class MainActivity : AppCompatActivity(), CustomDiasDaSemanaAdpter.OnItemClickListener {

    private lateinit var bind: ActivityMainBinding
    private var diasSemana: ArrayList<String> =
        arrayListOf("SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA", "SABADO", "DOMINGO")
    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        linearLayoutManager = LinearLayoutManager(this)
        bind.recyclerViewDiasDaSemana.layoutManager = linearLayoutManager
        bind.recyclerViewDiasDaSemana.adapter = CustomDiasDaSemanaAdpter(diasSemana, this)
        setContentView(bind.root)
    }

    override fun onItemClick(dia: String) {
        Toast.makeText(this, dia, Toast.LENGTH_SHORT).show()
        val intent = Intent(this, DiaDaSemanaActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, dia)
        }
        startActivity(intent)
    }
}