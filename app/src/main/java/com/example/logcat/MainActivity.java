package com.example.logcat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.logcat.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Log.i("우상현", "onCreate 실행됩니다");

        binding.button1.setOnClickListener(v -> printLog("button1 activated"));
        binding.button2.setOnClickListener(v -> printLog("button2 activated"));
        binding.button3.setOnClickListener(v -> printLog("button3 activated"));
        binding.button4.setOnClickListener(v -> printLog("button4 activated"));
        binding.centerbutton.setOnClickListener(v -> {
            Log.i("우상현", "Textview내용: " + binding.textView.getText());
            Log.i("우상현", "EditText내용: " + binding.edit.getText());
        });
    }

    private void printLog(String message){
        Log.i("우상현", message);
    }
}