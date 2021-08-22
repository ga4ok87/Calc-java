package com.company;

import java.util.ArrayList;

public class NumbersToString {

    public String GetString (ArrayList<Character> numbers){

        StringBuilder stringBuilder = new StringBuilder();
        for(Character ch: numbers)
        {
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
