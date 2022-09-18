package com.lecture.review.R2209.R220912;

public class BinaryTreeCircuit220912 {

    Node root;

    public static void main(String[] args) {
        BinaryTreeCircuit220912 binaryTreeCircuit220912 = new BinaryTreeCircuit220912();
        binaryTreeCircuit220912.root = new Node(1);
        binaryTreeCircuit220912.root.lt = new Node(2);
        binaryTreeCircuit220912.root.rt = new Node(3);
        binaryTreeCircuit220912.root.lt.lt = new Node(4);
        binaryTreeCircuit220912.root.lt.rt = new Node(5);
        binaryTreeCircuit220912.root.rt.lt = new Node(6);
        binaryTreeCircuit220912.root.rt.rt = new Node(7);
        binaryTreeCircuit220912.solution(binaryTreeCircuit220912.root);
    }

    private void solution(Node root) {
        dfs(root);
    }

    private void dfs(Node root) {
        if(root==null) return;
        else{
            dfs(root.lt);
            System.out.print(root.data+" ");
            dfs(root.rt);
        }
    }

    static class Node{
        int data;
        Node lt, rt;
        Node rightNode;

        public Node(int data) {
            this.data = data;
            lt=rt=null;
        }
    }
}
