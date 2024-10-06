package com.estefano.foodapp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.estefano.foodapp.R;
import com.estefano.foodapp.databinding.FragmentRecoverPasswordBinding;


public class RecoverPasswordFragment extends Fragment {

    FragmentRecoverPasswordBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRecoverPasswordBinding.inflate(getLayoutInflater());

        binding.imageVBack.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_recoverPasswordFragment_to_loginFragment));
        binding.buttonSend.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_recoverPasswordFragment_to_newPasswordFragment));

        return binding.getRoot();
    }
}