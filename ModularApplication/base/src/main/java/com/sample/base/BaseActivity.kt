package com.sample.base

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.sample.base.databinding.ActivityBaseBinding

class BaseActivity : AppCompatActivity() {
    private var binding: ActivityBaseBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //        setContentView(R.layout.activity_base);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_base)
    }
}
