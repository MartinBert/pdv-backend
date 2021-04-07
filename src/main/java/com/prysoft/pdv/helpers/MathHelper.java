package com.prysoft.pdv.helpers;

import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class MathHelper {
    public double bringAmountPlusPercentage(double amount, double percentage){
        double result = amount * (1 + decimalPercent(percentage));
        return roundTwoDecimals(result);
    }
    public double bringResultOfPercentageCalcule(double amount, double percentage){
        double result = amount * decimalPercent(percentage);
        return roundTwoDecimals(result);
    }
    public double sumNumbers(ArrayList<Double> numbers){
        double result = numbers.stream().reduce(0.0, Double::sum);
        return roundTwoDecimals(result);
    }
    public double decimalPercent (double percentage) {
        double result = percentage / 100;
        return roundTwoDecimals(result);
    }
    private double roundTwoDecimals(double number){
        double result = Math.round(number * 100.0)/100.0;
        return result;
    }
}
