package com.ase.finals.designPattern.facade;

/**
 * Created by jayavardhanpatil on 12/10/19
 */
public class CarMaker {

    private Vehicle luxuryCar;
    private Vehicle sedanCar;
    private Vehicle sportsCar;
    private Vehicle hatchBackCar;

    public CarMaker(){
        luxuryCar = new LuxuryCar();
        sedanCar = new SedanCar();
        sportsCar = new SportsCar();
        hatchBackCar = new HatchBackCar();
    }

    public void OrderLuxuryCar(){
        luxuryCar.manufacture();
    }

    public void OrderSedanCar(){
        sedanCar.manufacture();
    }

    public void OrderSportsCar(){
        sportsCar.manufacture();
    }

    public void OrderHatchBackCar(){
        hatchBackCar.manufacture();
    }
}
