package com.com.generics.problem;

/**
 * @author Shashank
 */
public class Generics2 {
    public static void main(String[] args) {
        GenericsClass<Integer> intObj = new GenericsClass<>(1);
        GenericsClass<String> strObj = new GenericsClass<>("Shashank");

        System.out.println(intObj.getData());
        System.out.println(strObj.getData());
    }
}

class GenericsClass<T> {
    private T data;
    public GenericsClass(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}