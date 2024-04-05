package com.example.practice_7.DataLayer.DS;

import com.example.practice_7.DataLayer.Model.Wool;
import java.util.ArrayList;

public class WoolDB {
    private static WoolDB instance;
    private ArrayList<Wool> wools;
    public static WoolDB getInstance(){
        if (instance == null){
            instance = new WoolDB();
        }
        return instance;
    }
    private WoolDB(){
        wools = new ArrayList<>();
        wools.add(new Wool("Короткая шерсть"));
        wools.add(new Wool("Длинная шерсть"));

    }
    public ArrayList<Wool> getWools() {
        return wools;
    }
    public void setWools(ArrayList<Wool> wools) {
        this.wools = wools;
    }
}
