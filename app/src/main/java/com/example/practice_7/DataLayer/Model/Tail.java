package com.example.practice_7.DataLayer.Model;

public class Tail {
    private String name;

    public Tail(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return name;
    }
}