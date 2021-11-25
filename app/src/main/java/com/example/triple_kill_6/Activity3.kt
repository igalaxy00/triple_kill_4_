package com.example.triple_kill_6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triple_kill_6.databinding.Activity3Binding

class Activity3 : Abstract() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Activity3Binding.inflate(layoutInflater).apply {
            setContentView(root)
            navView.setNavigationItemSelectedListener(this@Activity3)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            btnToFirst.setOnClickListener {
                Intent(this@Activity3, Activity1::class.java).apply {
                    this.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                    startActivity(this)
                }
            }
            btnToSecond.setOnClickListener {
                finish()
            }
            again.setOnClickListener {
                Intent(this@Activity3, Activity3::class.java).apply {
                    this.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
                    startActivity(this)
                }
            }
        }
    }
}