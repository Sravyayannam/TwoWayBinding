package com.example.yannamreddy.asynchttpclientsample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,OnLoopjCompleted {

    EditText etSearchTerms;
    Button btnSearch;
    TextView tvSearchResults;
    HttpClientWeb httpclientweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSearchTerms = (EditText) findViewById(R.id.etSearchTerms);
        btnSearch = (Button) findViewById(R.id.btnSearch);
        tvSearchResults = (TextView) findViewById(R.id.tvSearchResults);

        btnSearch.setOnClickListener(this);
        httpclientweb = new HttpClientWeb(this,this);

    }

    @Override
    public void onClick(View v) {
        String searchTerm = etSearchTerms.getText().toString();
        etSearchTerms.setText("");
        // make Loopj HTTP call
          httpclientweb.executeLoopjCall(searchTerm);
    }


    @Override
    public void taskCompleted(String results) {
        tvSearchResults.setText(results);
    }
}