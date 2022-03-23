package com.lecture.dfsbfsbasic;

class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt=rt=null;
    }
}

public class BinaryTreeCircuit {
    Node root;
    public void dfs(Node root) {
        if (root == null) return;
        else{
            dfs(root.lt);
            dfs(root.rt);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        BinaryTreeCircuit tree = new BinaryTreeCircuit();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.dfs(tree.root);
    }
}
