package com.example.practice_7.DataLayer.DS;
import com.example.practice_7.DataLayer.Model.Paw;
import java.util.ArrayList;
public class PawDB {
    private static PawDB instance;
    private ArrayList<Paw> paws;
    public static PawDB getInstance(){
        if (instance == null){
            instance = new PawDB();
        }
        return instance;
    }
    private PawDB(){
        paws = new ArrayList<>();
        paws.add(new Paw("Короткие лапы"));
        paws.add(new Paw("Длинные лапы"));

    }
    public ArrayList<Paw> getPaws() {
        return paws;
    }
    public void setPaws(ArrayList<Paw> paws) {
        this.paws = paws;
    }
}
