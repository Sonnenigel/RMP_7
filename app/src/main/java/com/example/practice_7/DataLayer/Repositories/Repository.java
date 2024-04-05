package com.example.practice_7.DataLayer.Repositories;

import androidx.lifecycle.MutableLiveData;

import com.example.practice_7.DataLayer.DS.PawDB;
import com.example.practice_7.DataLayer.DS.MenuDB;
import com.example.practice_7.DataLayer.DS.TailDB;
import com.example.practice_7.DataLayer.DS.WoolDB;
import com.example.practice_7.DataLayer.Model.Paw;
import com.example.practice_7.DataLayer.Model.Wool;
import com.example.practice_7.DataLayer.Model.Tail;
import com.example.practice_7.DomainLayer.Repositories;

import java.util.ArrayList;

public class Repository implements Repositories {
    private static Repository instance;
    private MutableLiveData<String> paw;
    private MutableLiveData<String> wool;
    private MutableLiveData<String> tail;
    private MutableLiveData<String> buffer;
    public static Repository getInstance(){
        if (instance == null){
            instance = new Repository();
        }
        return instance;
    }
    private Repository(){
        paw = new MutableLiveData<>();
        wool = new MutableLiveData<>();
        tail = new MutableLiveData<>();
        buffer = new MutableLiveData<>();
    }
    @Override
    public MutableLiveData<String> getPaw() {
        paw.setValue(MenuDB.getInstance().getPaw());
        return paw;
    }
    @Override
    public MutableLiveData<String> getWool() {
        wool.setValue(MenuDB.getInstance().getWool());
        return wool;
    }
    @Override
    public MutableLiveData<String> getTail() {
        tail.setValue(MenuDB.getInstance().getTail());
        return tail;
    }
    @Override
    public MutableLiveData<String> getBuffer() {
        buffer.setValue(MenuDB.getInstance().getBuffer());
        return buffer;
    }

    @Override
    public ArrayList<Paw> getPawDB() {
        return PawDB.getInstance().getPaws();
    }

    @Override
    public ArrayList<Wool> getWoolDB() { return WoolDB.getInstance().getWools(); }
    @Override
    public ArrayList<Tail> getTailDB() { return TailDB.getInstance().getTails(); }


    @Override
    public void setPaw(String name) { MenuDB.getInstance().setPaw(name); }

    @Override
    public void setWool(String name) {
        MenuDB.getInstance().setWool(name);
    }

    @Override
    public void setTail(String name) { MenuDB.getInstance().setTail(name); }

    @Override
    public void setBuffer(String name) { MenuDB.getInstance().setBuffer(name); }
}
