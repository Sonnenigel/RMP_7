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
import com.example.practice_7.UILayer.Adapter.PawAdapter;
import com.example.practice_7.UILayer.VM.PawViewModel;
import com.example.practice_7.R;
import com.example.practice_7.databinding.FragmentPawBinding;

public class PawFragment extends Fragment implements Item {
    private FragmentPawBinding binding;
    private PawViewModel viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPawBinding.inflate(getLayoutInflater());
        viewModel =  new ViewModelProvider(this).get(PawViewModel.class);
        PawAdapter adapter = new PawAdapter(getContext(), viewModel.getPaws(), this);
        binding.listViewPaw.setAdapter(adapter);
        return binding.getRoot();
    }

    @Override
    public void onItemClicked(Object paw) {
        Repository.getInstance().setBuffer(paw.toString());
        Navigation.findNavController(binding.getRoot()).navigate(R.id.action_pawFragment_to_pawDetailsFragment2);
    }
}