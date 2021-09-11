package com.company;

public class TryParse {

    public Double tryParseDouble(String value){
        try{
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }


}

