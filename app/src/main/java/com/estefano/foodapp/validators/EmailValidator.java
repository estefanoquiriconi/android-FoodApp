package com.estefano.foodapp.validators;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class EmailValidator {
    public static void setupEmailValidation(EditText editTextEmail, TextInputLayout textFieldEmail) {
        editTextEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                textFieldEmail.setEndIconVisible(Patterns.EMAIL_ADDRESS.matcher(editable.toString()).matches());
            }
        });
    }
}
