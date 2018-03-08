package com.valentin;

public class Main {

    public static void main(String[] args) {
        int randomNumber=45;

        Tree tree =new Tree();

        tree.add(45);
        tree.add(12);
        tree.add(1);
        tree.add(55);
        tree.add(60);

        tree.print();

        tree.contains(randomNumber);
    }
}
//