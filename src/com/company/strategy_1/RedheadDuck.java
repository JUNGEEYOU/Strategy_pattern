package com.company.strategy_1;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    public void display(){
        System.out.println("빨간머리오리입니다!");
    }
    public void fly(){
        System.out.println("파다파닥!");
    }
    public void quack(){
        System.out.println("꽥꽥~!");
    }
}
