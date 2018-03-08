package com.valentin;

public class Main {

    public static void main(String[] args) {
        int n=5;

        FixedList fixedList =new FixedList(n);


        Integer s=5;
        Double h=8.2123;
        Object obj=h+s;
        Object obj2=obj+"d";
        Object obj3="text";

        fixedList.add(s);
        fixedList.add(h);
        fixedList.add(obj);
        fixedList.add(obj2);
        fixedList.add(obj3);

        fixedList.print();

        fixedList.remove();
        fixedList.print();
        fixedList.remove();
        fixedList.print();
        fixedList.remove();
        fixedList.print();
        fixedList.remove();
        fixedList.print();
        fixedList.remove();
        fixedList.print();
        fixedList.remove();
        fixedList.print();
    }
}
////////