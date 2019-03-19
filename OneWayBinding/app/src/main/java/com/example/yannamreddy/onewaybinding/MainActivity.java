package com.example.yannamreddy.onewaybinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;


import com.example.yannamreddy.onewaybinding.databinding.ActivityMainBinding;




public class MainActivity extends AppCompatActivity {
    public static final String TAG =MainActivity.class.getSimpleName();

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User();
        user.setName("Learn2Crack");
       // user.setAge("20");
        binding.setUser(user);
        binding.setActivity(this);


    }

    public void onButtonClick(String age){

        //Log.d(TAG, "Email :" +binding.getUser()
        // .getEmail());
        Log.d(TAG, "Age :" +binding.getUser().getAge());
        //Log.d(TAG, "Email : "+age);

        Toast.makeText(this,"Hi",Toast.LENGTH_SHORT).show();
    }
}