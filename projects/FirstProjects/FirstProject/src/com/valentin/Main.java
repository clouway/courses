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

        //biggest common divider of 4 and 5
        math.biggestCommonDiv(4,5);

        //greatest common divider of 4 and 5
        math.greatestCommonDiv(4,5);

        //Printing the array
        arrClass.printArr(commonArr);

        //The min element
        arrClass.getMinElement(commonArr);

        //The sum of the elements
        arrClass.getSum(commonArr);

        //The sorted Array
        quickSort.quickSort(commonArr);

        //The reversed Array
        reverseArray.reverseArray(commonArr);

        }
    }
