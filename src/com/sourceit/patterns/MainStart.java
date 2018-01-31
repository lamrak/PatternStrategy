package com.sourceit.patterns;

import com.sourceit.patterns.behavior.FlyBehavior;
import com.sourceit.patterns.behavior.NoFlyBehavior;
import com.sourceit.patterns.model.AbsDuck;
import com.sourceit.patterns.model.RedhadDuck;
import com.sourceit.patterns.model.ToyDonaldDuck;

public class MainStart {

    public static void main(String[] args) {
        AbsDuck donald = new ToyDonaldDuck(new NoFlyBehavior());
        AbsDuck redhed = new RedhadDuck(new FlyBehavior());

        donald.display();
        donald.quack();
        donald.swim();
        donald.makeFly();

        System.out.println();
        redhed.display();
        redhed.quack();
        redhed.swim();
        redhed.makeFly();
    }
}
