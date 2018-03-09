package com.valentin;


public class Main {
    static ReverseArray reverseArray=new ReverseArray();
    static ArrClass arrClass=new ArrClass();
    static QuickSort quickSort=new QuickSort();
    static Math math=new Math();

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] commonArr = {23,4,54,65,7};
        int a=4;
        int b=5;

        System.out.printf("The BCD of %d and %d is %d \n ",a,b,math.biggestCommonDiv(a,b));

        System.out.printf("The GCD of %d and %d is %d \n ", a,b,math.greatestCommonDiv(a,b));

        arrClass.printArr(commonArr);

        System.out.printf("The min element: %d \n",arrClass.getMinElement(commonArr));

        System.out.printf("The sum: %d \n",arrClass.getSum(commonArr));

        arrClass.printArr(quickSort.quickSort(commonArr));

        arrClass.printArr(reverseArray.reverseArray(commonArr));

        }
    }
