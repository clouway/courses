package com.valentin;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringToInt stringToInt=new StringToInt();
        Sumator sumator=new Sumator();
        Scanner scanner=new Scanner(System.in);
        while (true){
        System.out.print("Enter number: ");
        String input=scanner.next();
        if (stringToInt.check(input)){
            int a=Integer.parseInt(input);
            System.out.print("One more: ");
            input=scanner.next();
            if (stringToInt.check(input)){
                int b=Integer.parseInt(input);
                System.out.println("----------");
                System.out.println("The sum is: "+ sumator.sum(a,b)+"\n");
            }
        }
        }

/*
        BigInteger A=new BigInteger("1234567");
        BigInteger B=new BigInteger("1233688");
        BigDecimal D=new BigDecimal("1.1234567");
        BigDecimal F=new BigDecimal("123.3688");

        System.out.println(sumator.sum(3,5));
        System.out.println(sumator.sum(3.5,5.32));
        System.out.println(sumator.sum("Micro","Python"));
        System.out.println(sumator.sum(D,F));
        System.out.println(sumator.sum(A,B));

*/
    }
}