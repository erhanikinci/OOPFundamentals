package com.erhanikinci.oopprogramming;

public class Piano implements Instrument, HouseDecor{

    String brand;
    boolean digital;


    @Override
    public void info() {
        System.out.println("override method");
    }
}
