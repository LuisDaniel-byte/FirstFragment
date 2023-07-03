package com.example.firstfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         //Agregar el fragmento al contenedor
         val fragment = ExampleFragment()
         supportFragmentManager.beginTransaction()
             .add(R.id.fragmentContainer, fragment) //fragmentContainer es un contenedor definido en tu diseño de actividades
             .commit()
    }
}
