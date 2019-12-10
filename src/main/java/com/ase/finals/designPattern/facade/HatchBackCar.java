package com.ase.finals.designPattern.facade;

/**
 * Created by jayavardhanpatil on 12/10/19
 */
public class HatchBackCar implements Vehicle {
    @Override
    public void manufacture(int quantity) {
        System.out.println("Manufacturing " + quantity + " HatchBack car(s)");
    }
}
