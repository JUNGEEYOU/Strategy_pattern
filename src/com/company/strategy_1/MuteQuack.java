package com.company.strategy_1;

public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<< 조용~~ >>");
    }
}
