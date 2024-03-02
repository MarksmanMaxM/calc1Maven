package com.sky.calculator.controller;

import com.sky.calculator.controller.Exceptions.DivideZeroException;
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
                    break;
                    }
                else {throw new DivideZeroException("Деление на 0 запрещено!");}

        }
        return result;


    }
}

