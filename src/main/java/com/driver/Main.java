package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly obj=new RWOnly();
       // obj.name="srinu";
        //System.out.println(obj.name);
        obj.setName("srinu");
        System.out.println(obj.getName());
    }
  
}