package com.valentin;


public class ArrClass {

    /**
     *
     * @param array
     * @return
     */
    public int getMinElement(int [] array){
        int length=array.length;
        int minPos=0;
        int minVal=array[minPos];
        for (int i=1;i<length;i++) {
            if (array[minPos] > array[i]) {
                minPos = i;
                minVal = array[minPos];
            }
        }
        return minVal;
    }

    /**
     *
     * @param array
     * @return
     */

    int getSum(int [] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }

    /**
     *
     * @param array
     */
    void printArr(int [] array){
        String arr="";
        for(int i=0;i<array.length;i++){
            arr+=" "+array[i];

        }
        System.out.println("The array is: "+arr);
    }
}