package com.example.logonrm.calculafrete

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var multiplacador:Int
        skKM.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tvSeek.setText(progress.toString())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })


        spEstados.onItemSelectedListener=(object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                val tipoEstado = enumEstados.from(position)

                when(tipoEstado){
                    enumEstados.BH -> multiplacador = 1
                    enumEstados.RJ -> multiplacador = 2
                    enumEstados.SP -> multiplacador = 3
                    enumEstados.MG -> multiplacador = 4

                }
            }
        })

        val telaResultado = Intent (this,ResultadoActivity::class.java)
        telaResultado.putExtra("Peso",etPeso.toString())

    }
}
