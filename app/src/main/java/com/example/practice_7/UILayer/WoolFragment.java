package com.example.practice_7.UILayer;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practice_7.DataLayer.Repositories.Repository;
import com.example.practice_7.Item;
import com.example.practice_7.UILayer.Adapter.WoolAdapter;
import com.example.practice_7.UILayer.VM.WoolViewModel;
import com.example.practice_7.R;
import com.example.practice_7.databinding.FragmentWoolBinding;

public class WoolFragment extends Fragment implements Item {
    private FragmentWoolBinding binding;
    private WoolViewModel viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentWoolBinding.inflate(getLayoutInflater());
        viewModel =  new ViewModelProvider(this).get(WoolViewModel.class);
        WoolAdapter adapter = new WoolAdapter(getContext(), viewModel.getWools(), this);
        binding.listViewWool.setAdapter(adapter);
        return binding.getRoot();
    }

    @Override
    public void onItemClicked(Object paw) {
        Repository.getInstance().setBuffer(paw.toString());
        Navigation.findNavController(binding.getRoot()).navigate(R.id.action_woolFragment_to_tailDetailsFragment2);
    }
}