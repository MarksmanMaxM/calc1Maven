package com.sky.calculator.controller;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {


    @Override
    public double calculate(double a, double b, String symbol) {
        double result = 0;

        switch(symbol) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                    break;}
                else {break;}

        }
        return result;


    }
}

