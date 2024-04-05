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
import com.example.practice_7.UILayer.Adapter.TailAdapter;
import com.example.practice_7.UILayer.VM.TailViewModel;
import com.example.practice_7.R;
import com.example.practice_7.databinding.FragmentTailBinding;

public class TailFragment extends Fragment implements Item {
    private FragmentTailBinding binding;
    private TailViewModel viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTailBinding.inflate(getLayoutInflater());
        viewModel =  new ViewModelProvider(this).get(TailViewModel.class);
        TailAdapter adapter = new TailAdapter(getContext(), viewModel.getTails(), this);
        binding.listViewTail.setAdapter(adapter);
        return binding.getRoot();
    }

    @Override
    public void onItemClicked(Object paw) {
        Repository.getInstance().setBuffer(paw.toString());
        Navigation.findNavController(binding.getRoot()).navigate(R.id.action_tailFragment_to_woolDetailsFragment);
    }
}