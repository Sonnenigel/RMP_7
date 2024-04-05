package com.example.practice_7.UILayer.VM;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.practice_7.DataLayer.Repositories.Repository;

public class ResultViewModel extends ViewModel {
    private MutableLiveData<String> paw = new MutableLiveData<>();
    private MutableLiveData<String> wool = new MutableLiveData<>();
    private MutableLiveData<String> tail = new MutableLiveData<>();
    public MutableLiveData<String> getPaw(){
        return Repository.getInstance().getPaw();
    }
    public MutableLiveData<String> getWool(){
        return Repository.getInstance().getWool();
    }
    public MutableLiveData<String> getTail(){
        return Repository.getInstance().getTail();
    }
}
