package com.yannamreddy.samplelogin;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button loginbutton;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbutton = (Button)findViewById(R.id.buttonLogin);
        username = (EditText)findViewById(R.id.editTextName);
        password = (EditText)findViewById(R.id.editTextPassword);



        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")) {

                    Intent intent = new Intent(MainActivity.this, Welcome.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Details",Toast.LENGTH_SHORT).show();


                }
            }
        });


    }
}