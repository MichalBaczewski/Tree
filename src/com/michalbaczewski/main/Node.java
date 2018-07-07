package com.michalbaczewski.main;

public class Node {

    private String value;
    private Node leftChild;
    private Node rightChild;

    public Node(String value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public String getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }
}

