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

    public void OrderLuxuryCar(int quantity){
        luxuryCar.manufacture(quantity);
    }

    public void OrderSedanCar(int quantity){
        sedanCar.manufacture(quantity);
    }

    public void OrderSportsCar(int quantity){
        sportsCar.manufacture(quantity);
    }

    public void OrderHatchBackCar(int quantity){
        hatchBackCar.manufacture(quantity);
    }
}
