package com.example.jitpackdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jittoast.JToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        JToast.show(this,"123456");
    }
}