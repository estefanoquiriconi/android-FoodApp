package com.estefano.foodapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.estefano.foodapp.R;
import com.estefano.foodapp.databinding.FragmentPasswordResetBinding;


public class PasswordResetFragment extends Fragment {

    FragmentPasswordResetBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPasswordResetBinding.inflate(getLayoutInflater());

        binding.buttonDone.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_passwordResetFragment_to_loginFragment));

        return binding.getRoot();
    }
}