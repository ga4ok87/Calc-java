package com.company;

import java.util.Scanner;



public class Main {


    public static void main(String[] args) {


        StringToMath stringToMath = new StringToMath();
        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Калькулятор:");

        while (!exit) {
            String input = keyboard.nextLine();
            if(input != null) {

                if ("q".equals(input)) {
                    System.out.println("Exit programm");
                    exit = true;
                } else {


                    MathOperation mathOperation = new MathOperation();
                    MathExpression mathExpression = stringToMath.StringToMathExpression(input);

                    Double res = mathOperation.Operation(mathExpression.numbers, mathExpression.mathSymbols);

                    System.out.println(res);


                }
            }
        }
        keyboard.close();

/*


*/

    }

}
