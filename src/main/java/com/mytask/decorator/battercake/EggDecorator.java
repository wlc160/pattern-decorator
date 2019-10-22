package com.mytask.decorator.battercake;

public class EggDecorator extends BattercakeDecorator{

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getInfo() {
        return super.getInfo() + "+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
