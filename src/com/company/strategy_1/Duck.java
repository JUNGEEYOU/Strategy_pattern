package com.company.strategy_1;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // performFly, performQuack:  각자 오리 형태에 맞게 행동함.
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    // setFlyBehavior,setQuackBehavior:  동적으로 나는 행동과 소리내는 행동을 지정하기 위한 메소드들
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
    // display(): 오리마다 모양이 달라서 추상메소드로 구현
    public abstract void display();
    // swim(): 모든 오리의 공통 메소드
    public void swim(){
        System.out.println("음파음파~!");
    }
}