package com.valentin;

public class Main {

    public static void main(String[] args) {
        Integer a=3;
        Double b=4.2;
        Dog dog=new Dog("Gosho",4,"Red");
        Cat cat=new Cat("Moncho",5,4);

        HTree tree=new HTree();

        tree.add(a,a);
        tree.add(2,b);
        tree.add(dog.weight,dog);
        tree.add(cat.weight,cat);

        tree.print();


    }
}
