package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        // Updateボタンのハンドラ
        // 時刻のアップデートを行う
        binding.dateUpdateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.dateText.setText(new Date().toString());
            }
        });

        // Transボタンのハンドラ
        // TableViewへ遷移
        binding.transButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), TableActivity.class);
                startActivity(intent);
            }
        });

        setContentView(view);
    }

    //test2

}