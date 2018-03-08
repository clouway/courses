package com.valentin;

public class Main {

    public static void main(String[] args) {
        Integer a=3;
        Double b=4.2;
        Dog dog=new Dog("Gosho",4,"Red");
        Cat cat=new Cat("Moncho",5,4);

        HTree tree=new HTree();
        tree.add(a,a);
        tree.add(b,2);
        tree.add(dog,dog.weight);
        tree.add(cat,cat.weight);
        tree.printTree();
        tree.print();


    }
}