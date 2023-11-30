package com.calculator.calc1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class CalcController {
    private final CalcInterface calcInterface;

    public CalcController(CalcInterface calcInterface) {
        this.calcInterface = calcInterface;
    }

    @GetMapping
    public String answer(@RequestParam("a") String aSym, @RequestParam() String symbol, @RequestParam("b") String bSym) {
        return "Ответ: " + aSym + symbol + bSym + " = " +  + calcInterface.check(Double.parseDouble(aSym), Double.parseDouble(bSym), symbol);

    }


}
