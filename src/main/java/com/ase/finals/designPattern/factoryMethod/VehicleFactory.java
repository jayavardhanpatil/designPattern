package com.ase.finals.designPattern.factoryMethod;

/**
 * Created by jayavardhanpatil on 12/9/19
 */
public class VehicleFactory {

    public Vehicle getVehicleType(VehicleType vehicleType){
        Vehicle vehicle = null;
        switch (vehicleType){
            case BUS : vehicle = new Bus();
                    break;
            case SEDAN : vehicle = new Sedan();
                    break;
            case SUV : vehicle = new SUV();
                    break;
            case HATCHBACK: vehicle = new HatchBack();
                    break;
            case LUXURY: vehicle = new Luxury();
                    break;
            default:
                System.out.println("Vehicle type is not supported");
        }
        return vehicle;
    }

}
