package com.valentin;

public class Math {
    public Math(){}

    public int biggestCommonDiv(int a, int b) {
        while (a!=b){
            if (a>b){
                a=a-b;
            }else
            {
                b=b-a;
            }
        }return a;
    }

    public int greatestCommonDiv(int a, int b){

        while (b!=0){
            int c=a%b;
            a=b;
            b=c;

        }
       return a;
    }
}
