package com.company;
import com.company.strategy_1.*;

public class Main {

    public static void main(String[] args) {

		MallardDuck mallarduck = new MallardDuck();
		RedheadDuck redheadduck = new RedheadDuck();
		RubberDuck rubberduck = new RubberDuck();
		DecoyDuck decoyduck = new DecoyDuck();

		System.out.println("청둥오리 fly()");
		mallarduck.fly();			   // 파다파닥!
		System.out.println("빨간오리 fly()");
		redheadduck.fly();             // 파다파닥!
		System.out.println("러버덕 quack()");
		rubberduck.quack();            //삑삑~!

    }
}
