package com.lecture.review.R2209.R220913;

public class BinaryTreeCircuit220914 {

    Node root;

    public static void main(String[] args) {
        BinaryTreeCircuit220914 binaryTreeCircuit220914 = new BinaryTreeCircuit220914();
        binaryTreeCircuit220914.root = new Node(1);
        binaryTreeCircuit220914.root.lt = new Node(2);
        binaryTreeCircuit220914.root.rt = new Node(3);
        binaryTreeCircuit220914.root.lt.lt = new Node(4);
        binaryTreeCircuit220914.root.lt.rt = new Node(5);
        binaryTreeCircuit220914.root.rt.lt = new Node(6);
        binaryTreeCircuit220914.root.rt.rt = new Node(7);
        binaryTreeCircuit220914.solution(binaryTreeCircuit220914.root);
    }

    private void solution(Node root) {
        bfs(root);

    }

    private void bfs(Node root) {


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
