package com.com.generics.problem;

/**
 * @author  Shashank
 */
public class Generics1 {
    /**
     * method to create array using generics
     * @param e - reference of array
     * @param <E> - using this to create different datatype of array using single method
     */
    public <E> void myMethod(E[] e) {
        for (E value : e) {
            System.out.println(value + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] num = {55, 3, 95, 66, 42, 13};
        String [] str = {"Shashank", "Shubhasnhu", "Kartikay", "Shyam"};

        Generics1 generics1 = new Generics1();
        generics1.myMethod(num);
        generics1.myMethod(str);
    }
}
