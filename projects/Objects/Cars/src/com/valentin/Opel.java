package com.valentin;

public class Opel extends Car{
    private int weight,countPassengers;

    /**
     *
     * @param maxVelocity
     * @param color
     * @param year
     * @param weight
     * @param countPassengers
     */
    public Opel(int maxVelocity,String color,String year, int weight, int countPassengers){
        super(maxVelocity,color,year);
        this.weight=weight;
        this.countPassengers=countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getWeight() {
        return weight;
    }
}
