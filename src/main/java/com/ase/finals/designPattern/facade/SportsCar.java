package com.ase.finals.designPattern.facade;

/**
 * Created by jayavardhanpatil on 12/10/19
 */
public class SportsCar extends Vehicle {

    @Override
    void collectParts() {
        System.out.println("collecting parts for Sports car");
    }

    @Override
    void assembleParts() {
        System.out.println("Assembling the parts in Sports car");
    }

    @Override
    void fitInteriors() {
        System.out.println("Fitting sports Car Interior");
    }
}
