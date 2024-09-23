package com.estefano.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.estefano.foodapp.databinding.ActivityRecoverPasswordBinding;
import com.estefano.foodapp.validators.EmailValidator;

public class RecoverPasswordActivity extends AppCompatActivity {

    ActivityRecoverPasswordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityRecoverPasswordBinding.inflate(getLayoutInflater());
        binding.textFieldEmail.setEndIconVisible(false);
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EmailValidator.setupEmailValidation(binding.editTextEmail, binding.textFieldEmail);
    }

    public void goBack(View view){
        finish();
    }

    public void goPasswordReset(View view){
        Intent intent = new Intent(this, PasswordResetActivity.class);
        startActivity(intent);
    }
}