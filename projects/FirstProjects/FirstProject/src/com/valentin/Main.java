package com.valentin;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ReverseArray reverseArray=new ReverseArray();
    static ArrClass arrClass=new ArrClass();
    static QuickSort quickSort=new QuickSort();

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] commonArr={};

        while (true){
            try{
                System.out.println("What do you want to do? \r\n Press a key from 1 to 7 to choose. \r\n 1 for Biggest Common Divisor \n 2 for Greatest Common Divisor");
                System.out.println("3 for entering a new Array \r\n 4 for min element from the Array");
                System.out.println("5 for getting the sum of the Array \r\n 6 for quickSorting the array");
                System.out.println("7 for reversing the array \r\n 8 for EXIT");
                int request=scanner.nextInt();
                switch (request) {
                    case 1:
                        biggestCommonDiv();
                        Thread.sleep(1000);
                        System.out.println("\r\n");
                        break;
                    case 2:
                        greatestCommonDiv();
                        Thread.sleep(1000);
                        System.out.println("\r\n");
                        break;
                    case 3:
                        int[] tempArr = enterArr();
                        commonArr = Arrays.copyOf(tempArr, tempArr.length);
                        arrClass.printArr(commonArr);
                        Thread.sleep(1000);
                        System.out.println("\r\n");
                        break;
                    case 4:
                        System.out.println("The min element is: " + arrClass.getMinElement(commonArr));
                        Thread.sleep(1000);
                        System.out.println("\r\n");
                        break;
                    case 5:
                        System.out.println("The sum is: " + arrClass.getSum(commonArr));
                        Thread.sleep(1000);
                        System.out.println("\r\n");
                        break;
                    case 6:
                        arrClass.printArr(commonArr);
                        int[] arrSorted = quickSort.quickSort(commonArr);
                        System.out.println("The sorted arr is:");
                        arrClass.printArr(arrSorted);
                        System.out.println("\r\n");
                        Thread.sleep(1000);
                        break;
                    case 7:
                        System.out.println("The reversed arr: ");
                        arrClass.printArr(reverseArray.reverseArray(commonArr));
                        System.out.println("\r\n");
                        Thread.sleep(1000);
                        break;
                    case 8:
                        return;
                }


            }catch (Exception e){
                e.printStackTrace();
                continue;
            }
        }
    }

    public static void biggestCommonDiv() {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        while (a!=b){
            if (a>b){
                a=a-b;
            }else
            {
                b=b-a;
            }
        }
        System.out.println("The BCD is: " + a);
    }


    /**
     *
     */
    public static void greatestCommonDiv(){

        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        while (b!=0){
            int c=a%b;
            a=b;
            b=c;

        }
        System.out.println("The GCD is: "+a);
    }

    /**
     *
     * @return
     */
    public static int[] enterArr(){
        System.out.println("How many numbers?");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<=n-1; i++){
            System.out.println("Enter a number");
            arr[i]=(scanner.nextInt());
        }
        arrClass.printArr(arr);
        return arr;
    }
}
