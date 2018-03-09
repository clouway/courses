package com.valentin;


import java.util.Arrays;

public class ReverseArray {
    /**
     *
     * @param arr
     * @return
     */
    public int[] reverseArray(int[] arr){
        int[] copyArr= Arrays.copyOf(arr,arr.length);
        int j=copyArr.length-1,tempVal=0;
        for(int i=0;i<=j;i++){
            tempVal=copyArr[i];
            copyArr[i]=copyArr[j];
            copyArr[j]=tempVal;
            j--;
        }
        return copyArr;
    }
}

//