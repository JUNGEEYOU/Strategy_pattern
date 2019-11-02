package com.company;
import com.company.strategy_1.*;

public class Main {

    public static void main(String[] args) {

		MallardDuck mallarduck = new MallardDuck();
		mallarduck.display();       // 청둥오리입니다!
		mallarduck.performFly();    // 날고있어요!
		mallarduck.performQuack();  // 꽥꽥~!

		Duck model = new ModelDuck();
		model.performFly();        // 저는 못날아요!
		model.setFlyBehavior(new FlyRockerPowerd());
		model.performFly();       //  로켓 추진으로 날아갑니다!

    }
}
