package com.calculator.calc1;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class calcService implements CalcInterface {


    @Override
    public double plus(double a, double b) {
        return a + b;
    }

    @Override
    public double minus(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }

    @Override
    public double check(double a, double b, String symbol) {
            double result = 0;

            switch(symbol) {
                case "+":
                    result = plus(a, b);
                    break;
                case "-":
                    result = minus(a, b);
                    break;
                case "*":
                    result = multiply(a, b);
                    break;
                case "/":
                    if (b != 0) {
                    result = divide(a, b);
                    break;}
                    else {break;}

            }
            return result;


    }
}

