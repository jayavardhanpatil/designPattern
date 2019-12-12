package com.ase.finals.designPattern.facade;

/**
 * Created by jayavardhanpatil on 12/10/19
 */
public class SedanCar extends Vehicle {

    @Override
    void collectParts() {
        System.out.println("Collecting Parts for sedan Car");
    }

    @Override
    void assembleParts() {
        System.out.println("Assembling Parts for Sedan Car");
    }

    @Override
    void fitInteriors() {
        System.out.println("Fitting sedan for Interior");
    }
}
