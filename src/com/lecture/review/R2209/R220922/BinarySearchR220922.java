package com.lecture.review.R2209.R220922;


public class BinarySearchR220922 {
    static Node root;
    public static void main(String[] args) {
        BinarySearchR220922 binarySearchR220922 = new BinarySearchR220922();
        binarySearchR220922.root = new Node(1);
        binarySearchR220922.root.lt = new Node(2);
        binarySearchR220922.root.rt = new Node(3);
        binarySearchR220922.root.lt.lt = new Node(4);
        binarySearchR220922.root.lt.rt = new Node(5);
        binarySearchR220922.root.rt.lt = new Node(6);
        binarySearchR220922.root.rt.rt = new Node(7);
        binarySearchR220922.solution(root);
    }

    private void solution(Node root) {
        dfs(root);
    }

    private void dfs(Node root) {
        if(root==null) return;
        else{
            dfs(root.lt);
            System.out.print(root.data + " ");
            dfs(root.rt);
        }
    }

    static class Node{
        int data;
        Node lt, rt;

        public Node(int data) {
            this.data = data;
            lt=rt=null;
        }
    }
}
