package com.ase.finals.designPattern.facade;

/**
 * Created by jayavardhanpatil on 12/9/19
 */
public class Application {

    public static void main(String[] args) {

        CarMaker carMaker = new CarMaker();
        carMaker.OrderHatchBackCar(4);
        carMaker.OrderLuxuryCar(2);
        carMaker.OrderSedanCar(4);
    }
}
