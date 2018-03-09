package com.valentin;

import java.util.ArrayList;
import java.util.List;

public class FixedList {
    private int length;
    private List<Object> objectList=new ArrayList<>();
    public FixedList(int length){
        this.length =length;
    }

    public void add(Object object) throws OutOfRangeException {
        if (objectList.size()<length)
            objectList.add(object);
        else throw new OutOfRangeException("Entered more than "+length+" elements");

    }
    
    public void remove() throws ListIsEmptyException {
        if (!objectList.isEmpty())
            objectList.remove(objectList.size()-1);
        else throw new ListIsEmptyException ("The list is already empty");
    }
    
    public void print(){
        System.out.println("\n..................................................................");
        for (int i=0;i<objectList.size();i++){
            System.out.print("\t("+(i+1)+")"+objectList.get(i)+"\t");
        }
        System.out.println("\n..................................................................\n");
    }
}