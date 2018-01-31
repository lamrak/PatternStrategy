package com.sourceit.patterns.model;

import com.sourceit.patterns.behavior.IBehavior;

public class ToyDonaldDuck extends AbsDuck {

    public ToyDonaldDuck(IBehavior flyBehavior) {
        super(flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm a toy Danald duck from movies");
    }
}
