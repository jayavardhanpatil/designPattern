package com.ase.finals.designPattern.strategy;

import java.util.Calendar;

/**
 * Created by jayavardhanpatil on 12/9/19
 */
public class CalculateContext {

    private Calculator calculator;

    public CalculateContext(){
    }

    public void setStrategy(Calculator strategy){
        this.calculator = strategy;
    }

    public double calculate(double op1, double op2){
        return calculator.calculateOperation(op1, op2);
    }

}
