package com.example.practice_7.DataLayer.DS;
import com.example.practice_7.DataLayer.Model.Tail;
import java.util.ArrayList;
public class TailDB {
    private static TailDB instance;
    private ArrayList<Tail> tails;
    public static TailDB getInstance(){
        if (instance == null){
            instance = new TailDB();
        }
        return instance;
    }
    private TailDB(){
        tails = new ArrayList<>();
        tails.add(new Tail("Короткий хвост"));
        tails.add(new Tail("Средний хвост"));
        tails.add(new Tail("Длинный хвост"));

    }
    public ArrayList<Tail> getTails() {
        return tails;
    }
    public void setTails(ArrayList<Tail> tails) {
        this.tails = tails;
    }
}
