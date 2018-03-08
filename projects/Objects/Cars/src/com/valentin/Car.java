package com.valentin;


public class Car {
    private int maxVelocity;
    private String color;
    private String year;

    public Car(){}

    /**
     *
     * @param maxVelocity
     * @param color
     * @param year
     */
    public Car(int maxVelocity,String color,String year){
        this.color=color;
        this.year=year;
        this.maxVelocity=maxVelocity;
    }

    public void setMaxVelocity(int newValue){
        maxVelocity=newValue;
    }
    public void setColor(String newValue){
        color=newValue;
    }

    public void setYear(String newValue){
        year=newValue;
    }

    public int getMaxVelocity(){
        return maxVelocity;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }


}
//