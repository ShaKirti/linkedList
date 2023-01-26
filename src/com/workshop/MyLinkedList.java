package com.workshop;

public class MyLinkedList<k> {
    private MyLinkedList next;
    private k key;

    public MyLinkedList(k key) {
        this.key = key;
        this.next = null;
    }
    public k getKey() {
        return key;
    }
    public void setNext(MyLinkedList next){
        this.next = next;
    }
}
