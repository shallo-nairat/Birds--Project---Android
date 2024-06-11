package com.example.hello

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivitySecondBinding
import com.example.hello.databinding.ActivityThirdactivityBinding
import com.squareup.picasso.Picasso

class thirdactivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding=ActivityThirdactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etbtnnext3.setOnClickListener {
            val intent = Intent ( this, fourthactivity::class.java)
            startActivity(intent)
        }

        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1602009941965-2bdde47c6e27?q=80&w=989&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .into(binding.etbtnnext3)



    }
    }
