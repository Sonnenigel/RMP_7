package com.example.practice_7.DataLayer.Model;

public class Paw {
    private String name;

    public Paw(String name){
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