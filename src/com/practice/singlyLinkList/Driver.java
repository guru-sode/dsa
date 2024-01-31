package com.practice.singlyLinkList;

public class Driver {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtLast(list, 1);
        list.insertAtLast(list, 8);
        list.insertAtLast(list, 5);
        list.insertAtLast(list, 6);
        list.insertAtLast(list, 7);
        list.insertAtFirst(list, 2);
        list.deleteLastNode(list);

        list.printList(list);
        System.out.println(list.length(list));
    }
}
