package com.mytask.decorator.battercake;

public class BattercakeDecoratorTest {

    public static void main(String[] args) {
        Battercake cake = new BaseBattercake();
        cake = new BeefDecorator(cake);
        cake = new EggDecorator(cake);
        System.out.println(cake.getInfo() + "总价：" + cake.getPrice());


    }

}
