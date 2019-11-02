package com.company.strategy_1;

public class MallardDuck extends Duck implements Flyable, Quackable  {
    public void display(){
        System.out.println("청둥오리입니다!");
    }
    public void fly() {
        System.out.println("파다파닥!");
    }
    public void quack() {
        System.out.println("꽥꽥~!");
    }
}
