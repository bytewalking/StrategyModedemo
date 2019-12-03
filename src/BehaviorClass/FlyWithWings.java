package BehaviorClass;

import BehaviorInterface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyWithWings");
    }
}
