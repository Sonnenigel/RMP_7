package com.example.practice_7.DomainLayer;


import androidx.lifecycle.MutableLiveData;

import com.example.practice_7.DataLayer.Model.Paw;
import com.example.practice_7.DataLayer.Model.Wool;
import com.example.practice_7.DataLayer.Model.Tail;

import java.util.ArrayList;

public interface Repositories {
    MutableLiveData<String> getPaw();
    MutableLiveData<String> getWool();
    MutableLiveData<String> getTail();
    MutableLiveData<String> getBuffer();
    ArrayList<Paw> getPawDB();
    ArrayList<Wool> getWoolDB();
    ArrayList<Tail> getTailDB();

    void setPaw(String var);
    void setWool(String var);
    void setTail(String var);
    void setBuffer(String var);
}
