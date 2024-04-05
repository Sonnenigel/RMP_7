package com.example.practice_7.UILayer.VM;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.practice_7.DataLayer.Repositories.Repository;

public class WoolDetailsViewModel extends ViewModel {
    private MutableLiveData<String> buffer = new MutableLiveData<>();

    public MutableLiveData<String> getBuffer() {
        return Repository.getInstance().getBuffer();
    }
}