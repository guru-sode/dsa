package com.practice.doublyLinkList;

public class Driver {

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtLast(list, 1);
        list.insertAtLast(list, 8);
        list.insertAtLast(list, 5);
        list.insertAtLast(list, 6);
        list.insertAtLast(list, 7);
        list.insertAtFirst(list, 2);
//        list.deleteLastNode(list);

        list.printList(list);
        System.out.println(list.length(list));
    }
}
