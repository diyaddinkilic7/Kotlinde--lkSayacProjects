package com.diyaddinkilic.sayacprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.diyaddinkilic.sayacprojesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //  setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Abstract Class

        object : CountDownTimer(15000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                binding.textView.text = "kalan${millisUntilFinished/1000}"
            }

            override fun onFinish() {
                binding.textView.text = "Kalan: 0"
            }

        }.start()
    }
}