package com.ase.finals.designPattern.strategy;

/**
 * Created by jayavardhanpatil on 12/9/19
 */
public class Multiplication implements Calculator {
    @Override
    public double calculateOperation(double op1, double op2) {
        return op1 * op2;
    }
}
