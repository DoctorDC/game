package com.example.mymathdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String kk = "abccd";
        int num = FreeCode.lengthOfLongestSubstring(kk);
        Log.d(TAG, "onCreate: "+num);
    }
}