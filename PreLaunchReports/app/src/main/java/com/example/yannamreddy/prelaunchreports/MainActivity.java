package com.example.yannamreddy.prelaunchreports;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializes compound view from the code.
        CustomView customView;
        customView = (CustomView)this
                .findViewById(R.id.customview_id);

    }
}
