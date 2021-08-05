package com.pratheek.resume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableInt
import com.pratheek.resume.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    var observableDummyData = ObservableDummyData(
        ObservableInt(3),
        ObservableInt(4),
        ObservableInt(7)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)

        binding.observable = observableDummyData
    }
}