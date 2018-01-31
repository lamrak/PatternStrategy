package com.sourceit.patterns.model;

import com.sourceit.patterns.behavior.IBehavior;

public class RedhadDuck extends AbsDuck {

    public RedhadDuck(IBehavior flyBehavior) {
        super(flyBehavior);
    }

    @Override
    public void display() {
        System.out.println("RedhadDuck with red had");
    }
}
