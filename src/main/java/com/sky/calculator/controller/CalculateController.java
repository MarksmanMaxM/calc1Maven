package com.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class CalculateController {
    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public String calculation(@RequestParam("a") Double aSym, @RequestParam() String symbol, @RequestParam("b") Double bSym) {
        if(symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/")) {
            return "Ответ: " + aSym + symbol + bSym + " = " + calculateService.calculate(aSym, bSym, symbol);
        }
        else return "<b>Ошибка в вычислении!</b> Проверьте введённые данные.";
    }


}
