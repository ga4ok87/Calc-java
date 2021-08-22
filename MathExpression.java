package com.company;

import java.util.ArrayList;

public class MathExpression {

     ArrayList<Double> numbers = new ArrayList<Double>();
     ArrayList<Character> mathSymbols = new ArrayList<Character>();
     char[] math = new char[] {'+','-','*','/'};

     public boolean math(char symbol) {

          for(int i = 0; i < math.length; i++)
          if (symbol == math[i]) return false;
          return true;
     }
}
