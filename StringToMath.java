package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StringToMath {

    public MathExpression StringToMathExpression(String expression){


            ArrayList<Character> numbers = new ArrayList<>();
            MathExpression mathExpression = new MathExpression();
            TryParse tryParse = new TryParse();
            NumbersToString numbersToString = new NumbersToString();

            //mathExpression.mathSymbols.add('+');

            char[] expressionChars = expression.toCharArray();

            for (int i = 0; i < expressionChars.length; i++){
                char expressionChar = expressionChars[i];
                boolean isNumber = mathExpression.math(expressionChar);
                if (i == 0) {
                    numbers.add(expressionChar);// if first number start minus
                    continue;
                }


                else if (isNumber == true) numbers.add(expressionChar);


                if (isNumber == false || i == expressionChars.length-1)

                 {
                    String numberString = numbersToString.GetString(numbers);

                           // System.out.println(numberString);

                    Double doubleNumber = tryParse.tryParseDouble(numberString);
                    mathExpression.numbers.add(doubleNumber);
                    if (isNumber == false) mathExpression.mathSymbols.add(expressionChar);

                    numbers.clear();



                }

        }

        return mathExpression;
    }



}
