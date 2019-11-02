package com.company.strategy_1;

public class RubberDuck extends Duck{
    public RubberDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
    public void display() {
        System.out.println("러버덕입니다!");
    }

}
