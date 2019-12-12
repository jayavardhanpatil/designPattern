package com.ase.finals.designPattern.facade;

/**
 * Created by jayavardhanpatil on 12/10/19
 */
public class LuxuryCar extends Vehicle {

    @Override
    void collectParts() {
        System.out.println("Collecting Parts for Luxury Car");
    }

    @Override
    void assembleParts() {
        System.out.println("Assembling Parts for Luxury Car");
    }

    @Override
    void fitInteriors() {
        System.out.println("Fitting Luxury car Interior");
    }
}
