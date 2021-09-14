package com.example.programmingmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.programmingmobile.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void onClick(View view) {
        binding.imageView.setImageResource(R.drawable.city);
        Toast.makeText(this, "안녕하세요 버튼 클릭입니다!", Toast.LENGTH_LONG).show();
    }
}