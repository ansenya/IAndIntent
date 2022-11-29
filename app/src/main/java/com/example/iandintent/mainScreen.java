package com.example.iandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.iandintent.databinding.ActivityMainScreenBinding;
import com.example.iandintent.databinding.LoginBinding;


public class mainScreen extends AppCompatActivity implements View.OnClickListener {

    ActivityMainScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.takePhoto.setOnClickListener(this);
        Bundle arguments = getIntent().getExtras();
        String mail = arguments.get("mail").toString();
        binding.hello.setText("Привет, " + mail );
        Log.d("mailm", mail);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.takePhoto):
                Intent intent = getIntent();
                intent.setComponent(null);
                intent.setPackage("com.google.android.GoogleCamera");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                Log.v("rRoll", "");

        }
    }
}