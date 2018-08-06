package com.example.mm.eventbus2;

public class MessageEvent1 {

    String some;

    public MessageEvent1(String some)
    {
       this.some = some;

    }

    public String getSome() {
        return some;
    }

    public void setSome(String some) {
        this.some = some;
    }

}
