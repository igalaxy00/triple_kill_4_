package com.example.triple_kill_6

import android.content.Intent
import android.os.Bundle
import com.example.triple_kill_6.databinding.Activity1Binding

class Activity1 : Abstract() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Activity1Binding.inflate(layoutInflater).apply {
            setContentView(root)
            navView.setNavigationItemSelectedListener(this@Activity1)
            btnToSecond.setOnClickListener {
                startActivity(Intent(this@Activity1, Activity2::class.java))
            }

        }
    }
}