package com.michalbaczewski.main;

public class BinaryTree {

    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

  /*  public void showTreePreOrder(){
        System.out.println("pre-order: ");
        preOrder(root);
        System.out.println();
    }

    public void showTreeInOrder(){
        System.out.println("in-order: ");
        inOrder(root);
        System.out.println();
    }

    public void showTreePostOrder(){
        System.out.println("post-order: ");
        postOrder(root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if (node != null) {
            visit(node);
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeftChild());
            visit(node);
            inOrder(node.getRightChild());
        }
    }

    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            visit(node);
        }
    }

    private static void visit(Node node) {
        System.out.print(node.getValue() + " ");
    }*/

  public void showTree(OrderEnum orderEnum) {
      System.out.println(orderEnum.name() + ": ");
      orderEnum.showTree(root);
      System.out.println();
  }

}
