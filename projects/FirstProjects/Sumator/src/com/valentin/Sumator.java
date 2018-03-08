package com.valentin;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Sumator {

    public Sumator(){
    }
    public int sum(int a, int b){

        return (a+b);
    }

    public double sum(Double a, Double b){

        return (a+b);
    }

    public String sum(String a, String b){
        return (a+b);
    }
    public BigInteger sum(BigInteger a, BigInteger b){
        BigInteger C=a.add(b);
        return C;
    }

    public BigDecimal sum(BigDecimal a, BigDecimal b){
        BigDecimal C=a.add(b);
        return C;
    }
}