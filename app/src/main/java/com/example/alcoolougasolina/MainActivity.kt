package com.example.alcoolougasolina

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var percentual:Double = 0.7
    lateinit var edAlcool: EditText
    lateinit var edGasolina: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            percentual=savedInstanceState.getDouble("percentual")
        }
        Log.d("PDM24", "No onCreate, $percentual")

        percentual=0.7
        val btCalc: Button = findViewById(R.id.btCalcular)
        val textMsg:TextView= findViewById(R.id.textMsg)
        val swPercent: Switch= findViewById(R.id.swPercentual)
        edAlcool = findViewById(R.id.edAlcool)
        edGasolina = findViewById(R.id.edGasolina)
        var gasolinaValor = edGasolina.text
        var alcoolValor = edAlcool.text

        swPercent.setOnClickListener {
            //código do evento
            percentual = 0.75
            Log.d("PDM24", "No swPercent, $percentual")
        }

        btCalc.setOnClickListener {
            //código do evento
            textMsg.text = "Gasolina: $gasolinaValor e Alcool: $alcoolValor"
            Log.d("PDM24", "No btCalcular, $percentual")
        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putDouble("percentual",percentual)
        super.onSaveInstanceState(outState)
    }

    override fun onResume(){
    super.onResume()
    Log.d("PDM24","No onResume, $percentual")
}
override fun onStart(){
    super.onStart()
    Log.v("PDM24","No onStart")
}
override fun onPause(){
    super.onPause()
    Log.e("PDM24","No onPause")
}
override fun onStop(){
    super.onStop()
    Log.w("PDM24","No onStop")
}
override fun onDestroy(){
    super.onDestroy()
    Log.wtf("PDM24","No Destroy")
}
}