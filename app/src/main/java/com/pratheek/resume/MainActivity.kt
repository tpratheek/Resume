package com.pratheek.resume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.pratheek.resume.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val helloWorld = "Welcome All"

    private var a: DummyDataClass = DummyDataClass(a = 5, b = 6, name = "Paul")

    private var b = 5

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.helloWorld = helloWorld

        binding.dummy = a
        binding.button3.setOnClickListener {
            nextActivity()
        }
    }

    fun nextActivity(){
        startActivity(Intent(this,SecondActivity::class.java))
    }
}