package com.basic.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.basic.viewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing View binding.
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        // Sets content.
        setContentView(binding.getRoot());

        // Attaching OnClickListener to "Update" Button.
        binding.buttonUpdate.setOnClickListener((v) -> {
            // Setting text from R.string.text_two.
            binding.textView.setText(R.string.text_two);
        });
    }
}