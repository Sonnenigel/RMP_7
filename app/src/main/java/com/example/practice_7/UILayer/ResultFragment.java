package com.example.practice_7.UILayer;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practice_7.R;
import com.example.practice_7.UILayer.VM.ResultViewModel;
import com.example.practice_7.databinding.FragmentResultBinding;

public class ResultFragment extends Fragment {

    private FragmentResultBinding binding;
    private ResultViewModel viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentResultBinding.inflate(getLayoutInflater());

        viewModel = new ViewModelProvider(this).get(ResultViewModel.class);

        viewModel.getPaw().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.info.setText("Лапы: " + s + "\n");
            }
        });

        viewModel.getWool().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.info.setText(binding.info.getText() + "Шерсть: " + s + "\n");
            }
        });

        viewModel.getTail().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.info.setText(binding.info.getText() + "Хвост: " + s);
            }
        });
        String wool = viewModel.getWool().getValue();
        String paw = viewModel.getPaw().getValue();
        String tail = viewModel.getTail().getValue();

        if (paw.equals("Короткие лапы")) {
            if (wool.equals("Короткая шерсть")) {
                if (tail.equals("Короткий хвост")) {
                    binding.doge.setImageResource(R.drawable.short_short_short);
                } else if (tail.equals("Средний хвост")) {
                    binding.doge.setImageResource(R.drawable.short_short_medium);
                } else {
                    binding.doge.setImageResource(R.drawable.short_short_long);
                }
            } else {
                if (tail.equals("Короткий хвост")) {
                    binding.doge.setImageResource(R.drawable.short_long_short);
                } else if (tail.equals("Средний хвост")) {
                    binding.doge.setImageResource(R.drawable.short_long_medium);
                } else {
                    binding.doge.setImageResource(R.drawable.short_long_long);
                }
            }
        }
        else {
            if (wool.equals("Короткая шерсть")) {
                if (tail.equals("Короткий хвост")) {
                    binding.doge.setImageResource(R.drawable.long_short_short);
                } else if (tail.equals("Средний хвост")) {
                    binding.doge.setImageResource(R.drawable.long_short_medium);
                } else {
                    binding.doge.setImageResource(R.drawable.long_short_long);
                }
            }
            else {
                if (tail.equals("Короткий хвост")) {
                    binding.doge.setImageResource(R.drawable.long_long_short);
                } else if (tail.equals("Средний хвост")) {
                    binding.doge.setImageResource(R.drawable.long_long_medium);
                } else {
                    binding.doge.setImageResource(R.drawable.long_long_long);
                }
            }
        }
        return binding.getRoot();
    }
}