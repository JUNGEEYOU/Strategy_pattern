package com.company.strategy_1;

public abstract class Duck {
    // 실체가 아닌 공통적인 특성을 모아 놓은 클래스라서 추상 클래스로 구현

    public void swim(){
        System.out.println("음파음파~!");
    }
    // 오리마다 모양이 달라서 추상메소드로 구현
    public abstract void display();
}