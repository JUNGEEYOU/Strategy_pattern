package com.company.strategy_1;

public class MallardDuck extends Duck {
    public MallardDuck(){
        // 생성자 안에 해당되는 하위 클래스로 객체 생성
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("청둥오리입니다!");
    }
}
