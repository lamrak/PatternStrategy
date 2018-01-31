package com.sourceit.patterns.behavior;

public class NoFlyBehavior implements IBehavior {

    @Override
    public void fly() {
        System.out.println("This duck can not fly");
    }
}
