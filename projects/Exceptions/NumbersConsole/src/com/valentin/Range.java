package com.valentin;

public class Range {
    private final Double upper;
    private final Double lower;
    public Range(Double lower, Double upper){
        this.lower=lower;
        this.upper=upper;
    }
    public boolean contains(Double number) throws OutOfRangeException{

        if (number<=upper  && number>=lower) {
            return true;
        }else  {
            throw new OutOfRangeException("The number is not in ["+lower+";"+upper+"] ") ;
        }
    }
}
