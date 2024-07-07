package com.masjapar.tmdb_fajar

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.masjapar.tmdb_fajar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var btnDaftar: Button
    private lateinit var btnHadiah: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnDaftar = findViewById(R.id.btnDaftar)
        btnHadiah = findViewById(R.id.btnHadiah)

        btnDaftar.setOnClickListener {
            val intent = Intent(this, DaftarActivity::class.java)
            startActivity(intent)
        }

        btnHadiah.setOnClickListener {
            val intent = Intent(this, HadiahActivity::class.java)
            startActivity(intent)
        }

    }
}