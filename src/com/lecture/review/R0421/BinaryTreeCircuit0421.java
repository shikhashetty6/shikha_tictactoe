package com.lecture.review.R0421;


import com.lecture.dfsbfsbasic.Node;

public class BinaryTreeCircuit0421 {

    Node root;

    public static void main(String[] args) {
        BinaryTreeCircuit0421 tree = new BinaryTreeCircuit0421();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.dfs(tree.root);
    }


    private void dfs(Node root) {
        if(root == null) return;
        else{
            System.out.print(root.data + " ");
            dfs(root.lt);
            dfs(root.rt);
        }
    }
}
