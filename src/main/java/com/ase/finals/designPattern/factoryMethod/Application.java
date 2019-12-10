package com.ase.finals.designPattern.factoryMethod;

import java.util.Vector;

/**
 * Created by jayavardhanpatil on 12/9/19
 */
public class Application {

    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle vehicle = factory.getVehicleType(VehicleType.BUS);
        vehicle.manufacture();

        vehicle = factory.getVehicleType(VehicleType.SEDAN);
        vehicle.manufacture();

        vehicle = factory.getVehicleType(VehicleType.LUXURY);
        vehicle.manufacture();

        vehicle = factory.getVehicleType(VehicleType.SUV);
        vehicle.manufacture();
    }
}
