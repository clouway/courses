package com.valentin;

public class StringToInt {

    public StringToInt(){
    }

    public boolean check(String possibleNumber){
    try {
        Integer.parseInt(possibleNumber);
        return true;
        }catch (IllegalArgumentException e){
        System.out.println("---------");
        System.out.println("Malformed number\n");
        return false;
    }
    }
}
