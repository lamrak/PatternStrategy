package com.sourceit.patterns.model;

import com.sourceit.patterns.behavior.IBehavior;

public abstract class AbsDuck {
    IBehavior flyBehavior;

    public AbsDuck(IBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void quack() {
        System.out.println("QUACK!");
    }

    public void swim() {
        System.out.println("I'm swimming");
    }

    public void makeFly() {
        flyBehavior.fly();
    }

    public abstract void display();
}
