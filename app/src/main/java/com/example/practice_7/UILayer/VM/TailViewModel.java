package com.example.practice_7.UILayer.VM;

import androidx.lifecycle.ViewModel;

import com.example.practice_7.DataLayer.Model.Tail;
import com.example.practice_7.DataLayer.Repositories.Repository;

import java.util.ArrayList;

public class TailViewModel extends ViewModel {
        private ArrayList<Tail> tails;

        public ArrayList<Tail> getTails() {
            return Repository.getInstance().getTailDB();
        }
    }