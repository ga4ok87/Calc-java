package com.company;

import java.util.ArrayList;

public class MathOperation {


    public Double Operation(ArrayList<Double> numbers, ArrayList<Character> mathSymbols) {

        ArrayList<Double> result = new ArrayList<>();
        ArrayList<Character> resultMath = new ArrayList<>();
        Math mathOperation = new Math();



        for (int i = 0; i < mathSymbols.size(); i++) {

            if (mathSymbols.get(i) == '*')
                numbers.set(i + 1, mathOperation.Multiply(numbers.get(i), numbers.get(i + 1)));

            if (mathSymbols.get(i) =='/')
                numbers.set(i + 1, mathOperation.Divide(numbers.get(i), numbers.get(i + 1)));

            if (mathSymbols.get(i) == '+' || mathSymbols.get(i) == '-') {
                result.add(numbers.get(i));
                resultMath.add(mathSymbols.get(i));
            }
            if (mathSymbols.size() == i+1) result.add(numbers.get(i + 1));
        }
        double sum = 0;
        for (int i = 0; i< resultMath.size(); i++) {
            if (resultMath.get(i) == '+')
                result.set(i+1,result.get(i) + result.get(i + 1));
            else result.set(i+1,result.get(i) - result.get(i + 1));
        }
        return result.get(result.size()-1);
    }
}

