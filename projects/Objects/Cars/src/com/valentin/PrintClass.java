package com.valentin;


public class PrintClass {
    public PrintClass(){}


    /**
     *
     * @param car
     */
    public void printClass(Car car){
        System.out.println("----------");
        System.out.println("Max Vel is: "+car.getMaxVelocity());
        System.out.println("Color: "+car.getColor());
        System.out.println("Year: "+car.getYear());
        System.out.println("----------");
        System.out.println("\r\n");
    }

    /**
     *
     * @param opel
     */
    public void printClass(Opel opel){
        System.out.println("----------");
        System.out.println("Max Vel is: "+opel.getMaxVelocity());
        System.out.println("Color: "+opel.getColor());
        System.out.println("Year: "+opel.getYear());
        System.out.println("Weight: "+opel.getWeight());
        System.out.println("Passengers: "+opel.getCountPassengers());
        System.out.println("----------");
        System.out.println("\r\n");
    }
}
