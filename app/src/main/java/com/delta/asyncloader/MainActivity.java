package com.delta.asyncloader;

import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

import retrofit2.Response;

public class MainActivity extends AppCompatActivity{

    private static UmoriliApi umoriliApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        umoriliApi = Controller.getApi();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Response response = umoriliApi.getData("2016-11-01").execute();
                    Log.d("RESPONSE", ""+response);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }

}
