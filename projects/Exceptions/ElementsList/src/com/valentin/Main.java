package com.valentin;

public class Main {

    public static void main(String[] args) {
        int n=5;

        ElementsClass elementsClass=new ElementsClass(n);


        Integer s=5;
        Double h=8.2123;
        Object obj=h+s;
        Object obj2=obj+"d";
        Object obj3="text";

        elementsClass.add(s);
        elementsClass.add(h);
        elementsClass.add(obj);
        elementsClass.add(obj2);
        elementsClass.add(obj3);

        elementsClass.print();

        elementsClass.remove();
        elementsClass.print();
        elementsClass.remove();
        elementsClass.print();
        elementsClass.remove();
        elementsClass.print();
        elementsClass.remove();
        elementsClass.print();
        elementsClass.remove();
        elementsClass.print();
        elementsClass.remove();
        elementsClass.print();
    }
}
////////