package com.ase.finals.designPattern.factoryMethod;

import java.util.Vector;

/**
 * Created by jayavardhanpatil on 12/9/19
 */
public class Application {

    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle vehicle = factory.getVehicleType("bus");
        vehicle.manufacture();

        vehicle = factory.getVehicleType("sedan");
        vehicle.manufacture();

        vehicle = factory.getVehicleType("luxury");
        vehicle.manufacture();

        vehicle = factory.getVehicleType("suv");
        vehicle.manufacture();
    }
}
