package com.example.responsipraktikum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.Activity_SplashScreen)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent (this,PemesananActivity::class.java)
            startActivity(intent)
            onDestroy()
        },5000)



    }



}