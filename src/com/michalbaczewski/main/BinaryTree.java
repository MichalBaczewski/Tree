package com.michalbaczewski.main;

public class BinaryTree {

    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public void showTreeInPreOrder(){
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node != null) {
            visit(node);
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }

    private static void visit(Node node) {
        System.out.print(node.getValue() + " ");
    }

}
