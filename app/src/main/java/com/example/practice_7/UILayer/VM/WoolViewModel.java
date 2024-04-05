package com.example.practice_7.UILayer.VM;

import androidx.lifecycle.ViewModel;

import com.example.practice_7.DataLayer.Model.Wool;
import com.example.practice_7.DataLayer.Repositories.Repository;

import java.util.ArrayList;

public class WoolViewModel extends ViewModel {
        private ArrayList<Wool> wools;

        public ArrayList<Wool> getWools() {
            return Repository.getInstance().getWoolDB();
        }
    }