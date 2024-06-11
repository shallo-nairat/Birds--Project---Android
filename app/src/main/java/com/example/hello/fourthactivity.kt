package com.example.hello

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFourthactivityBinding

class fourthactivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        binding= ActivityFourthactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etbtnnext4.setOnClickListener {
            val intent = Intent ( this, fourthactivity::class.java)
            startActivity(intent)
        }
        }

}