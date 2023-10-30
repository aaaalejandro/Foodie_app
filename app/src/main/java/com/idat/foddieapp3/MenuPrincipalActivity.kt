package com.idat.foddieapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuPrincipalActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.bottom_home -> {
                    replaceFragment(home_fragment())
                    true
                }
                R.id.bottom_restaurants -> {
                    replaceFragment(restaurant_fragment())
                    true
                }
                R.id.bottom_shopping_cart -> {
                    replaceFragment(shopping_cart_fragment())
                    true
                }
                R.id.bottom_account -> {
                    replaceFragment(account_fragment())
                    true
                }
                else -> false
            }
        }
        replaceFragment(home_fragment())
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()
    }
}