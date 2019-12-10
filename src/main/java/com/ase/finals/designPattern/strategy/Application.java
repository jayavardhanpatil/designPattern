package com.ase.finals.designPattern.strategy;

/**
 * Created by jayavardhanpatil on 12/9/19
 */
public class Application {

    public static void main(String[] args) {

        System.out.println("Addition : ");
        CalculateContext calculateContext = new CalculateContext();
        calculateContext.setStrategy(new Addition());
        System.out.println(calculateContext.calculate(10,20));

        System.out.println(" \nSubtraction : ");
        calculateContext.setStrategy(new Subtraction());
        System.out.println(calculateContext.calculate(10,20));
    }

}
