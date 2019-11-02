package com.company.strategy_1;

public class RedheadDuck extends Duck {
    public RedheadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("빨간머리오리입니다!");
    }
}
