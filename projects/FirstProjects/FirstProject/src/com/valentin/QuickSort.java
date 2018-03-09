package com.valentin;


import java.util.Arrays;

public class QuickSort {

    public QuickSort(){}


    public int[] quickSort(int[] arr){
        int[] arrCopy= Arrays.copyOf(arr,arr.length);
        sort(arrCopy,0,(arr.length)-1);
        return arrCopy;
    }


    /**
     *
     * @param arr
     * @param lowIndex
     * @param highIndex
     * @return
     */
    private int quickSortPart(int arr[], int lowIndex, int highIndex){

        int i=lowIndex;

        if(lowIndex<highIndex){
            int currIndex=(lowIndex+highIndex)/2;
            int current=arr[currIndex];
            int j=highIndex;
            int tempVal;
            while (i<=j){

                if (arr[i]>=current){

                    if(arr[j]<=current){

                        tempVal=arr[j];
                        arr[j]=arr[i];
                        arr[i]=tempVal;
                        i++;
                        j--;
                    }else{
                        j--;
                    }
                }else{
                    i++;
                }}
        }

        return i;
    }

    /**
     *
     * @param arr
     * @param lowIndex
     * @param highIndex
     */
    private void sort(int[] arr, int lowIndex, int highIndex){
        int pos=quickSortPart(arr,lowIndex,highIndex);
        if(lowIndex<pos-1){
            sort(arr,lowIndex,pos-1);
        }
        if(highIndex>pos){
            sort(arr,pos,highIndex);
        }
    }

}
