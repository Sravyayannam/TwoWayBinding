package com.example.yannamreddy.asynchttpclientsample;
//import com.loopj.android.http.*;
//import cz.msebera.android.httpclient.client.HttpClient;
//import cz.msebera.android.httpclient.Header;
//import com.loopj.android.http.AsyncHttpClient;
;
import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONObject;
import cz.msebera.android.httpclient.Header;
import android.content.Context;

public class HttpClientWeb {
    private static final String TAG = "MOVIE_TRIVIA";

    AsyncHttpClient asyncHttpClient;
    RequestParams requestParams;

    String BASE_URL = "http://www.omdbapi.com/?";
    String jsonResponse;
    OnLoopjCompleted loopjListener;
    private Context context;

    public HttpClientWeb(Context context, OnLoopjCompleted listener) {
        asyncHttpClient = new AsyncHttpClient();
        requestParams = new RequestParams();
        this.context = context;
        this.loopjListener = listener;
    }

    public void executeLoopjCall(String queryTerm) {
        requestParams.put("s", queryTerm);
        asyncHttpClient.get(BASE_URL, requestParams, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                jsonResponse = response.toString();
                loopjListener.taskCompleted(jsonResponse);
                Log.i(TAG, "onSuccess: " + jsonResponse);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
                Log.e(TAG, "onFailure: " + errorResponse);
            }
        });
    }
}
