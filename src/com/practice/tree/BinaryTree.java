package com.practice.tree;


public class BinaryTree {

    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private TreeNode insertRec(TreeNode root, int key) {
        if(root == null) {
            root = new TreeNode(key); // if root is null, then assign new node to root
            return root;
        }

        // recursion to order the data
        if(key < root.getData()) {
            root.setLeft(insertRec(root.getLeft(), key));
        } else {
            root.setRight(insertRec(root.getRight(), key));
        }
        return root;
    }

    // In order
    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(TreeNode root) {
        if(root != null) {
            inOrderRec(root.getLeft());
            System.out.print(root.getData() + " ");
            inOrderRec(root.getRight());
        }
    }

    //Pre order
    public void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(TreeNode root) {
        if(root == null)
            return;
        System.out.print(root.getData() + " ");
        preOrderRec(root.getLeft());
        preOrderRec(root.getRight());
    }

    //Post order
    public void postOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(TreeNode root) {
        if(root == null)
            return;
        postOrderRec(root.getLeft());
        postOrderRec(root.getRight());
        System.out.print(root.getData() + " ");
    }

}
