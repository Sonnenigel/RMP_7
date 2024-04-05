package com.example.practice_7.UILayer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.practice_7.R;
import com.example.practice_7.UILayer.VM.MenuViewModel;
import com.example.practice_7.databinding.FragmentMenuBinding;

public class MenuFragment extends Fragment {
    private FragmentMenuBinding binding;
    private MenuViewModel viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMenuBinding.inflate(getLayoutInflater());

        viewModel = new ViewModelProvider(this).get(MenuViewModel.class);
        viewModel.getPaw().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.textViewToPaw.setText(s);
            }
        });

        viewModel.getWool().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.textViewToWool.setText(s);
            }
        });

        viewModel.getTail().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.textViewToTail.setText(s);
            }
        });

        binding.textViewToPaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_menuFragment_to_pawFragment);
            }
        });

        binding.textViewToWool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_menuFragment_to_woolFragment);
            }
        });

        binding.textViewToTail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_menuFragment_to_tailFragment);
            }
        });

        binding.buttonRecordVisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_menuFragment_to_resultFragment);
            }
        });
        return binding.getRoot();
    }
}
