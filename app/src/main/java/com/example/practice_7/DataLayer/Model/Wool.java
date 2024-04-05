package com.example.practice_7.DataLayer.Model;

public class Wool {
    private String name;

    public Wool(String name){
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
