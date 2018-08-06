package com.example.mm.mapsrouter;

import java.util.ArrayList;

public class EventttwoPojo {


    Integer res;

    ArrayList<String> text;

    public int getRes() {
        return res;
    }

    public void setRes(Integer res) {
        this.res = res;
    }



    public EventttwoPojo(ArrayList<String> text,int res)
    {
        this.res=res;
        this.text = text;

    }

    public ArrayList<String> getText() {
        return text;
    }

    public void setText(ArrayList<String> text) {
        this.text = text;
    }





}
