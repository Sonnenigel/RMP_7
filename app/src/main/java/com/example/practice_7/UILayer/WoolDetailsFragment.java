package com.example.practice_7.UILayer;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practice_7.DataLayer.Repositories.Repository;
import com.example.practice_7.UILayer.VM.WoolDetailsViewModel;
import com.example.practice_7.databinding.FragmentWoolDetailsBinding;

public class WoolDetailsFragment extends Fragment {
    private FragmentWoolDetailsBinding binding;
    private WoolDetailsViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentWoolDetailsBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(this).get(WoolDetailsViewModel.class);
        viewModel.getBuffer().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.buttonSelect.setText("Выбрать " + s );
            }
        });
        binding.buttonSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Repository.getInstance().setTail(viewModel.getBuffer().getValue());
                Navigation.findNavController(binding.getRoot()).popBackStack();
                Navigation.findNavController(binding.getRoot()).popBackStack();
            }
        });
        return binding.getRoot();
    }
}
