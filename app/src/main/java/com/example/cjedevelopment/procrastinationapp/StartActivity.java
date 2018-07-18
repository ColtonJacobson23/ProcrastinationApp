package com.example.cjedevelopment.procrastinationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        //Hides title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
