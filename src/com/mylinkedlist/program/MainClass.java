package com.mylinkedlist.program;

//import java.util.Scanner;
import com.mylinkedlist.rpogram.Insertion_LinkedList;
/**
 * @author Shashank
 */
public class MainClass {
    public static void main(String[] args) {
        Insertion_LinkedList list = new Insertion_LinkedList();
        list.addFirst("56");
        list.addFirst("30");
        list.addLast("70");
        list.printList();
        System.out.println(list.getSize());

/*        while (true) {
            System.out.println("1. ADD FIRST \n2. ADD LAST \n3. PRINT LIST \n4. GET SIZE \nEXIT \nENTER YOUR CHOICE : ");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter element : ");
                    list.addFirst(new Scanner(System.in).next());
                }
                case 2 -> {
                    System.out.println("Enter element to add at last : ");
                    list.addLast(new Scanner(System.in).next());
                }
                case 3 -> list.printList();
                case 4 -> list.getSize();
                case 5 -> System.exit(0);
                default -> {
                    System.out.println("Good Bye");
                    return;
                }
            }
        }
 */
    }
}
