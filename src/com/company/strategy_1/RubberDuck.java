package com.company.strategy_1;

public class RubberDuck extends Duck implements Quackable{
    public void display() {
        System.out.println("러버덕입니다!");
    }
    @Override
    public void quack(){
        System.out.println("삑삑~!");
    }
}
