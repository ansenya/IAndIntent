package com.example.iandintent;

import static android.content.ContentValues.TAG;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.iandintent.databinding.LoginBinding;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = LoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.loginButton.setOnClickListener(this);
        binding.loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case (R.id.loginButton):
                if (binding.login.getText().toString().equals("rickroll@gmail.com") && binding.password.getText().toString().equals("RickAstley")) {
                    Log.v("rRoll", binding.login.getText() + "; " + binding.password.getText().toString());
                    intent = new Intent(MainActivity.this, mainScreen.class);
                    intent.putExtra("mail", binding.login.getText().toString());
                    startActivity(intent);
                    break;
                } else {
                    binding.wrong.setText("Неверный логин или пароль");
                    Log.v("rRoll", binding.login.getText() + "; " + binding.password.getText().toString());
                }
        }
    }
}