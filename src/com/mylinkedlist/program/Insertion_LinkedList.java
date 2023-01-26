package com.mylinkedlist.program;
/**
 * @author Shashank
 */
public class Insertion_LinkedList {
    Node head;
    private int size;

    Insertion_LinkedList(){
        this.size = 0;
    }
    class Node {
        String data;
        Node next;
        /*
        Constructor of node class
         */
        Node(String data) {
            this.data = data;
            this.next = null;

            size++;
        }
    }

    /**
     * method to add mode from the starting
     * 1) if head is null then head is equal to newNode
     * 2) & newNode.next is equal to head(which is null)
     * 3) head is equal to newNode
     * @param data - taking value as node
     */
    public void addFirst(String data) {
        Node newNode = new Node(data);
        /*
        1) if head is null then head is equal to newNode
         */
        if (head == null) {
            head = newNode;
            return;
        }
        /*
        2) & newNode.next is equal to head(which is null)
         */
        newNode.next = head;
        /*
        3) head is equal to newNode
         */
        head = newNode;
    }

    /**
     * method to add element at the last
     * 1) if head is null then head is equal to newNode
     * 2) creating a temporary head node which will traverse to check where is the null point
     * 3) Until the currNode.next != null, till then currNode = currNode.next and,
     * 4) when the currNode.next == null, then update the node with the newNode
     * @param data - taking value as node
     */
    public void addLast(String data) {
        Node newNode = new Node(data);
        /*
        1) if head is null then head is equal to newNode
         */
        if (head == null) {
            head = newNode;
            return;
        }
        /*
        2) creating a temporary head node which will traverse to check where is the null point
         */
        Node currNode = head;
        /*
        3) if currNode.next = null, then currNode = currNode.next and,
         */
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        /*
        4) when the currNode.next == null, then update the node with the newNode
         */
        currNode.next = newNode;
    }

    /**
     * method to print the list
     * 1) if head is null the print "List is empty"
     * 2) creating temporary head which will traverse in the linkedlist until the current node becomes zero
     * & print the data
     */
    public void printList() {
        /*
        1) if head is null the print "List is empty"
         */
        if (head == null) {
            System.out.println("List is empty!");
        }
        /*
        2) creating temporary head which will traverse in the linkedlist until the current node becomes zero
            & print the data
         */
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public int getSize() {
        return size;
    }
}