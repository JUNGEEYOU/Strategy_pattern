package com.company.strategy_1;

public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("저는 못날아요!");
    }
}
