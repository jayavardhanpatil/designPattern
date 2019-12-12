package com.ase.finals.designPattern.facade;

/**
 * Created by jayavardhanpatil on 12/10/19
 */
public class HatchBackCar extends Vehicle {
    @Override
    void collectParts() {
        System.out.println("Collecting Parts for Hatch Back Car");
    }

    @Override
    void assembleParts() {
        System.out.println("Assembling Parts for Hatch back Car");
    }

    @Override
    void fitInteriors() {
        System.out.println("Fitting HatcBack car Interior");
    }
}
