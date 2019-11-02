package com.company.strategy_1;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    public void display() {
        System.out.println("나무오리입니다!");
    }
}
