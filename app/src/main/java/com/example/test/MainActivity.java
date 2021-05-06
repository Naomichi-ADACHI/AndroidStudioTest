package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.test.databinding.ActivityMainBinding;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        binding.dateText.setText(new Date().toString());
        setContentView(view);
    }

    //test2

}