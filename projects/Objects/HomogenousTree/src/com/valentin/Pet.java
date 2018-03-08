package com.valentin;

public class Pet {

    String name;
    int weight;

    public Pet(String name, int weight){
        this.name=name;
        this.weight=weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
//
