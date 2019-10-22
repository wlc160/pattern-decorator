package com.mytask.decorator.battercake;

public class BeefDecorator extends BattercakeDecorator {

    public BeefDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getInfo() {
        return super.getInfo() + "+1片牛肉";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 5;
    }
}
