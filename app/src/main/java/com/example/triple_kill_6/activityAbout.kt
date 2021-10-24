package com.example.triple_kill_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triple_kill_6.databinding.ActivityAboutBinding

class activityAbout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener {
            finish()
        }
    }

}