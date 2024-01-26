package org.example;
import java.util.*;
public class Solution {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        MotorCycle m = new MotorCycle();
        Adder a =  new Adder();
        System.out.println("My Superclass is: " + a.getClass().getSuperclass().getSimpleName());
        System.out.println(a.add(10,32) + " "+ a.add(10,3) + " " +  a.add(10,10) + "\n");

    }
}