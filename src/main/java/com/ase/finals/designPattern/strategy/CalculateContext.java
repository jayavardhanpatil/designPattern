package com.ase.finals.designPattern.strategy;

/**
 * Created by jayavardhanpatil on 12/9/19
 */
public class CalculateContext {

    private Calculator calculator;

    public CalculateContext(Calculator calculator){
        this.calculator = calculator;
    }

    public double calculate(double op1, double op2){
        return calculator.calculateOperation(op1, op2);
    }

}
