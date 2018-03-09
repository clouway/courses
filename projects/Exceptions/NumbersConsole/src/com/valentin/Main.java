package com.valentin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws OutOfRangeException {
        Double lower=3.0,upper=54.0,number;
        Range range=new Range(lower,upper);



        while (true) {
            try {


                Scanner scanner=new Scanner(System.in);
                System.out.print("\nEnter a number in range ["+lower+";"+upper+"]");
                number=scanner.nextDouble();

                if (range.contains(number)) {
                    System.out.println("\nOK\n");
                }
            }catch (InputMismatchException e){
                System.out.println("Malformed number, try again!\n");
            }

        }

    }}


