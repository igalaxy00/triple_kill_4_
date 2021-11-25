package com.example.triple_kill_6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triple_kill_6.databinding.Activity2Binding

class Activity2 : Abstract() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Activity2Binding.inflate(layoutInflater).apply {
            setContentView(root)
            navView.setNavigationItemSelectedListener(this@Activity2)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            btnToFirst.setOnClickListener {
                finish()
            }
            btnToThird.setOnClickListener {
                startActivity(Intent(this@Activity2, Activity3::class.java))
            }
        }
    }
}