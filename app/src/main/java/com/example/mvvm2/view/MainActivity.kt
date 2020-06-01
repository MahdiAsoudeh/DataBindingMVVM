package com.example.mvvm2.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleOwner
import com.example.mvvm2.R
import com.example.mvvm2.databinding.ActivityMainBinding
import com.example.mvvm2.viewmodel.UserViewModel


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val userViewModel = UserViewModel(this)
        activityMainBinding.user = userViewModel


    }
}
