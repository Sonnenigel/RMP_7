package com.example.practice_7.DataLayer.DS;


public class MenuDB {
    private static MenuDB instance;
    private String paw;
    private String wool;
    private String tail;
    private String buffer;
    private String bufferW;
    private String bufferT;
    public static MenuDB getInstance(){
        if (instance == null){
            instance = new MenuDB();
        }
        return instance;
    }
    private MenuDB(){
        paw = "Выбрать лапы";
        wool = "Выбрать шерсть";
        tail = "Выбрать хвост";
        buffer = "";
    }

    public String getPaw() { return paw; }
    public String getWool(){
        return wool;
    }
    public String getTail(){
        return tail;
    }

    public String getBuffer() {
        return buffer;
    }

    public void setPaw(String var){
        paw = var;
    }
    public void setWool(String var){
        wool = var;
    }
    public void setTail(String var){
        tail = var;
    }

    public void setBuffer(String buffer) {
        this.buffer = buffer;
    }
}

