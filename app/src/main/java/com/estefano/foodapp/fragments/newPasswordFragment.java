package com.estefano.foodapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.estefano.foodapp.R;
import com.estefano.foodapp.databinding.FragmentNewPasswordBinding;

public class newPasswordFragment extends Fragment {

    FragmentNewPasswordBinding binding;

    @Override
    public View onCreateView(@NonNull  LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNewPasswordBinding.inflate(getLayoutInflater());

        binding.imageVBack.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_newPasswordFragment_to_recoverPasswordFragment));
        binding.buttonChangePass.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_newPasswordFragment_to_passwordResetFragment));

        return binding.getRoot();
    }
}