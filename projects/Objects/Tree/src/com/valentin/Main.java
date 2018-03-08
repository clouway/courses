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

        if (tree.add(60)) System.out.print("Added");
        else System.out.print("It is already added");

        tree.print();

        if (tree.contains(randomNumber)) System.out.print("Yes\n");
        else System.out.print("No\n");
    }
}