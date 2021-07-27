package com.example.dolarcordoba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var Resultado: Double = 00.0;
    fun calcular(view: View) {

        var ettipoCambio = findViewById<EditText>(R.id.etCambio).text.toString();
        var cambio = ettipoCambio!!.toDouble();
        var etcantidad = findViewById<EditText>(R.id.etCantidad).text.toString();
        var cantidad = etcantidad!!.toDouble();

        var opcion = findViewById<RadioButton>(R.id.rbopcion1)

        if (opcion.isChecked == true) {
            Resultado = cantidad / cambio;
            mostrar();
        } else {
            Resultado = cantidad * cambio;
            mostrar();
        }

    }

    fun mostrar() {
        var Result = findViewById<EditText>(R.id.etResultado)
        Result.setText(Resultado.toString());
    }
}