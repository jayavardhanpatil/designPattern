package com.ase.finals.designPattern.factoryMethod;

/**
 * Created by jayavardhanpatil on 12/9/19
 */
public class VehicleFactory {

    public static Vehicle getVehicleType(String vehicleType){
        Vehicle vehicle = null;
        switch (vehicleType){
            case "bus" : vehicle = new Bus();
                    break;
            case "sedan" : vehicle = new Sedan();
                    break;
            case "suv" : vehicle = new SUV();
                    break;
            case "hatchback" : vehicle = new HatchBack();
                    break;
            case "luxury" : vehicle = new Luxury();
                    break;
            default:
                System.out.println("Vehicle type is not supported");
        }
        return vehicle;
    }

}
