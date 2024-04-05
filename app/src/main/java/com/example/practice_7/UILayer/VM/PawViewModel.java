package com.example.practice_7.UILayer.VM;

import androidx.lifecycle.ViewModel;

import com.example.practice_7.DataLayer.Model.Paw;
import com.example.practice_7.DataLayer.Repositories.Repository;

import java.util.ArrayList;

public class PawViewModel extends ViewModel {
    private ArrayList<Paw> paws;

    public ArrayList<Paw> getPaws() {
        return Repository.getInstance().getPawDB();
    }
}