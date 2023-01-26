package com.workshop;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>(12);
        MyLinkedList<Integer> myList2 = new MyLinkedList<>(56);
        MyLinkedList<Integer> myList3 = new MyLinkedList<>(25);
        MyLinkedList<Integer> myList4 = new MyLinkedList<>(11);

        myList.setNext(myList2);
        myList2.setNext(myList3);
        myList3.setNext(myList4);
        System.out.println(myList.getKey()+"=>"+myList2.getKey()+"=>"+myList3.getKey()+"=>"+myList4.getKey());
    }
}
