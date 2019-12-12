package com.ase.finals.designPattern.facade;

/**
 * Created by jayavardhanpatil on 12/9/19
 */
public class Application {

    public static void main(String[] args) {

        CarMaker carMaker = new CarMaker();
        System.out.println("\n1) Order for HatchBack Car");
        carMaker.OrderHatchBackCar();

        System.out.println("\n2) Order for Luxury Car");
        carMaker.OrderLuxuryCar();

        System.out.println("\n3) Order for Sedan Car");
        carMaker.OrderSedanCar();
    }
}
