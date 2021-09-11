package com.company;

import java.util.ArrayList;

public class Math {

    public Double Multiply(double num1, double num2) {
        return num1 * num2;
    }

    public Double Divide(double num1, double num2) {
        return num1 / num2;
    }

    public Double Sum(ArrayList<Double> numbers, ArrayList<Character> symbols) {

        //double sum = 0;
        for (int i = 0; i < symbols.size(); i++) {
            if (symbols.get(i) == '+')
                numbers.set(i + 1, numbers.get(i) + numbers.get(i + 1));
            else numbers.set(i + 1, numbers.get(i) - numbers.get(i + 1));
        }
        return numbers.get(numbers.size() - 1);
    }
}
