package com.tech.myspftest23april

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var fmanager = supportFragmentManager
        var tx = fmanager.beginTransaction()
        tx.add(R.id.myframe, LoginFrag())
        tx.commit()
    }
}