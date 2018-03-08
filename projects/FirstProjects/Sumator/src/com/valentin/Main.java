package com.valentin;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Sumator sumator=new Sumator();

        BigInteger A=new BigInteger("1234567");
        BigInteger B=new BigInteger("1233688");
        BigDecimal D=new BigDecimal("1.1234567");
        BigDecimal F=new BigDecimal("123.3688");

        System.out.println(sumator.sum(3,5));
        System.out.println(sumator.sum(3.5,5.32));
        System.out.println(sumator.sum("Micro","Python"));
        System.out.println(sumator.sum(D,F));
        System.out.println(sumator.sum(A,B));

    }
}
