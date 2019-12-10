package com.ase.finals.designPattern.strategy;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by jayavardhanpatil on 12/9/19
 */
public class Application {

    public static void main(String[] args) {

        System.out.println("Addition : ");
        CalculateContext calculateContext = new CalculateContext(new Addition());
        System.out.println(calculateContext.calculate(10,20));

        System.out.println(" \nSubtraction : ");
        calculateContext = new CalculateContext(new Substraction());
        System.out.println(calculateContext.calculate(10,20));
    }

}
