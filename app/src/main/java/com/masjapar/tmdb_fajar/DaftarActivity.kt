package com.masjapar.tmdb_fajar

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class DaftarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        val tvFragment = TVFragment()
        val movieFragment = MovieFragment()
        val profilFragment = ProfilFragment()

        makeCurrentFragment (tvFragment)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_nav)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_tv -> makeCurrentFragment(tvFragment)
                R.id.menu_movie -> makeCurrentFragment(movieFragment)
                R.id.menu_profil -> makeCurrentFragment(profilFragment)
            }

            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_nav, fragment)
            commit()
        }
    }
}
