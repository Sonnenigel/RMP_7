package com.example.practice_7.UILayer.VM;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.practice_7.DataLayer.Repositories.Repository;

public class MenuViewModel extends ViewModel {
    private MutableLiveData<String> Paw = new MutableLiveData<>();
    private MutableLiveData<String> Wool = new MutableLiveData<>();
    private MutableLiveData<String> Tail = new MutableLiveData<>();
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