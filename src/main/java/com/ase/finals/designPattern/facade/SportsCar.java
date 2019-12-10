package com.ase.finals.designPattern.facade;

/**
 * Created by jayavardhanpatil on 12/10/19
 */
public class SportsCar implements Vehicle {
    @Override
    public void manufacture(int quantity) {
        System.out.println("Manufacturing "+ quantity +" Sports car(s)");
    }
}
