package com.example.mm.mapsrouter;

import java.util.ArrayList;

public class EventOnePojo {



    ArrayList<String> text;
    Integer res;

    public int getRes() {
        return res;
    }

    public void setRes(Integer res) {
        this.res = res;
    }



    public EventOnePojo(ArrayList<String> text,int res)
    {
        this.res =res;
        this.text = text;

    }

    public ArrayList<String> getText() {
        return text;
    }

    public void setText(ArrayList<String> text) {
        this.text = text;
    }






}
