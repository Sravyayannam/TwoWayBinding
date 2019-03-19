package com.sample.app

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.sample.base.BaseActivity
import com.sample.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val intent = Intent(this, BaseActivity::class.java)

        binding!!.btn.setOnClickListener{
            startActivity(intent)
        }
    }
}
