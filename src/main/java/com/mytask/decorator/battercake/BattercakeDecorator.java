package com.mytask.decorator.battercake;

public class BattercakeDecorator extends Battercake {

    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake){
        this.battercake = battercake;
    }

    protected String getInfo() {
        return this.battercake.getInfo();
    }

    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
