package com.ase.finals.designPattern.facade;

/**
 * Created by jayavardhanpatil on 12/10/19
 */
public abstract class Vehicle {

    public final void manufacture(){
        collectParts();
        assembleParts();
        fitInteriors();
        paintCar();
        dispatchFromFactory();
    }

    abstract void collectParts();

    abstract void assembleParts();

    abstract void fitInteriors();

    private void paintCar(){
        System.out.println("Painting the car");
    }

    private void dispatchFromFactory(){
        System.out.println("Car is ready and dispatching from factory");
    }
}
