package com.example.android.cookies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.android.cookies.R.drawable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun eatCookie(view: View){
        val afterEaten = findViewById<View>(R.id.textView_view) as TextView
        afterEaten.text = "Im full"
        val imageView = findViewById<View>(R.id.change_cookie_img) as ImageView
        imageView.setImageResource(R.drawable.after_cookie)
    }
}