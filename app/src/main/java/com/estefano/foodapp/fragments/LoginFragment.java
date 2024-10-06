package com.estefano.foodapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.estefano.foodapp.R;
import com.estefano.foodapp.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {

    FragmentLoginBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(getLayoutInflater());

        binding.tvForgotPassword.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_recoverPasswordFragment));
        binding.tvRegister.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_registerFragment));
        binding.buttonSignIn.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_profileFragment));

        return binding.getRoot();
    }
}