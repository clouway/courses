package com.valentin;

public class Dog extends Pet {
    String name;
    int weight;
    String color;
    public Dog (String name, int weight,String color){
        super(name,weight);
        this.color=color;
    }
}
//