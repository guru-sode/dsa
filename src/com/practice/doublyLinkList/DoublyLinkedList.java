package com.practice.doublyLinkList;

public class DoublyLinkedList {

    Node head;

    public boolean insertAtLast(DoublyLinkedList list, int data) {
        // create node with data
        Node new_node = new Node(data);

        // check if list is empty
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node current_node = list.head;
            while(current_node.next != null) {
                current_node = current_node.next;
            }

            // insert the node at last
            current_node.next = new_node;
        }
        return true;
    }

    public boolean insertAtFirst(DoublyLinkedList list, int data) {
        // create node with data
        Node new_node = new Node(data);

        // check if list is empty
        if(list.head == null) {
            list.head = new_node;
        } else {
            new_node.next = list.head;
            list.head = new_node;
            return true;
        }
        return false;
    }

    public void printList(DoublyLinkedList list) {
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

    public int length(DoublyLinkedList list) {
        int length = 1;

        // check if list is empty
        if(list.head == null) {
            return 0;
        } else {
            Node currentNode = list.head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                length++;
            }
        }
        return length;
    }
}
