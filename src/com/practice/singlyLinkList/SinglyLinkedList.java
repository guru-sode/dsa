package com.practice.singlyLinkList;

public class SinglyLinkedList {

    Node head;

    public boolean insertAtLast (SinglyLinkedList list, int data) {
        // create new node with data
        Node newNode = new Node(data);

        // check whether list is empty
        if(list.head == null) {
            list.head = newNode;
            return true;
        } else {
            Node currentNode = list.head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            // insert the new node at last
            currentNode.next = newNode;
        }
        return false;
    }

    public boolean insertAtFirst(SinglyLinkedList list, int data){
        // create new node with data
        Node newNode = new Node(data);

        // check if list is empty
        if(list.head == null) {
            list.head = newNode;
            return true;
        } else {
            newNode.next = list.head;
            list.head = newNode;
            return true;
        }
    }

    public void printList(SinglyLinkedList list) {
        // check if list is empty
        if(list.head == null) {
            System.out.println("List is empty");
        } else {
            Node currentNode = list.head;
            while (currentNode.next != null) {
                System.out.println(currentNode.data + " ");
                currentNode = currentNode.next;
            }
            System.out.println(currentNode.data + " ");
        }
    }

    public int length(SinglyLinkedList list) {
        // check if list is empty
        if(list.head == null){
            return 0;
        } else {
            Node currentNode = list.head;
            int length = 1;
            while (currentNode.next != null) {
                length++;
                currentNode = currentNode.next;
            }
            return length;
        }
    }

    public boolean isEmpty(SinglyLinkedList list) {
        if(list.head != null) {
            return false;
        }
        return true;
    }

    public boolean deleteLastNode(SinglyLinkedList list) {
        // check if list is empty
        if(list.head == null) {
            return false;
        } else {
            int length = length(list); // calculate the length
            Node currentNode = list.head;
            while (length > 2) {
                currentNode = currentNode.next;
                length--;
            }
            currentNode.next = null; // make next address null for n-1th node
            return true;
        }
    }
}
