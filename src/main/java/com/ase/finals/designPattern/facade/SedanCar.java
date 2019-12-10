package com.ase.finals.designPattern.facade;

/**
 * Created by jayavardhanpatil on 12/10/19
 */
public class SedanCar implements Vehicle {
    @Override
    public void manufacture(int quantity) {
        System.out.println("Manufacturing " + quantity + " SEDAN car(s)");
    }
}
