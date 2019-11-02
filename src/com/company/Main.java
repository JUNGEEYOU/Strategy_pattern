package com.company;
import com.company.strategy_1.*;

public class Main {

    public static void main(String[] args) {
	Duck mallarduck = new MallardDuck();
	Duck redheadduck = new RedheadDuck();

	System.out.println("청둥오리 quack()");
	mallarduck.quack();        			// 꽥꽥~!
	System.out.println("청둥오리 swim()");
	mallarduck.swim();					// 음파음파~!
	System.out.println("청둥오리 display()");
	mallarduck.display();				// 청둥오리입니다!

	System.out.println("빨간오리 quack()");
	redheadduck.quack();   				// 꽥꽥~!
	System.out.println("빨간오리 swim()");
	redheadduck.swim();					// 음파음파~!
	System.out.println("빨간오리 display()");
	redheadduck.display();				// 빨간머리오리입니다!


    }
}
