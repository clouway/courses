package com.valentin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Tree tree =new Tree();
        int i =0;
        System.out.println("How many numbers? ");
        try {

            int n = scanner.nextInt();
            while (i<n) {
                System.out.println("Enter number");
                tree.add(scanner.nextInt());
                i++;
            }
            tree.printTree();
            tree.print();
            while (true){
                System.out.println("Check for number(enter number): ");
                int number=scanner.nextInt();
                if (tree.contains(number)){
                    System.out.println("\nYes");
                }else {
                    System.out.println("\nNo");
                }}

        }catch (Exception e){
            System.out.println(e);
            return;
            }}
}