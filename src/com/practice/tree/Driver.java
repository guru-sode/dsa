package com.practice.tree;

public class Driver {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(2);
        tree.insert(6);
        tree.insert(8);
        tree.insert(7);
        tree.insert(3);
        tree.insert(4);
        tree.insert(1);

        System.out.println("In order:");
        tree.inOrder();

        System.out.println();
        System.out.println("Pre order:");
        tree.preOrder();

        System.out.println();
        System.out.println("Post order:");
        tree.postOrder();

        System.out.println();
        System.out.println("Levl order:");
        tree.levelOrder();
    }
}
