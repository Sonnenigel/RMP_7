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
import com.example.practice_7.UILayer.VM.PawDetailsViewModel;
import com.example.practice_7.databinding.FragmentPawDetailsBinding;

public class PawDetailsFragment extends Fragment {
    private FragmentPawDetailsBinding binding;
    private PawDetailsViewModel viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPawDetailsBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(this).get(PawDetailsViewModel.class);
        viewModel.getBuffer().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.buttonSelect.setText("Выбрать " + s );
            }
        });
        binding.buttonSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Repository.getInstance().setPaw(viewModel.getBuffer().getValue());
                Navigation.findNavController(binding.getRoot()).popBackStack();
                Navigation.findNavController(binding.getRoot()).popBackStack();
            }
        });
        return binding.getRoot();
    }
}
