package com.valentin;

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Opel opel=new Opel(90,"red","1999",1800,5);
        Mercedes mercedes=new Mercedes(400,"white","2002");
        VW vw=new VW(130,"yellow","2008");
        PrintClass printClass=new PrintClass();
        System.out.println(opel.getClass().getSimpleName());
        printClass.printClass(opel);
        System.out.println(mercedes.getClass().getSimpleName());
        printClass.printClass(mercedes);
        System.out.println(vw.getClass().getSimpleName());
        printClass.printClass(vw);
    }
}
//