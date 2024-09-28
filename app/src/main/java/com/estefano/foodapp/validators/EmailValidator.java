package com.estefano.foodapp.validators;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.widget.EditText;

import androidx.core.content.ContextCompat;

import com.estefano.foodapp.LoginActivity;
import com.estefano.foodapp.R;
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
                if(Patterns.EMAIL_ADDRESS.matcher(editable.toString()).matches()){
                    textFieldEmail.setEndIconDrawable(R.drawable.ic_check);
                    Drawable endIcon = textFieldEmail.getEndIconDrawable();
                    if(endIcon != null)
                        endIcon.setTint(ContextCompat.getColor(textFieldEmail.getContext(), R.color.green));
                }else{
                    textFieldEmail.setEndIconDrawable(R.drawable.ic_cancel);
                }
            }
        });
    }
}
