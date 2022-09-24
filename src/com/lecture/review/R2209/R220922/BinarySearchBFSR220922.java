package com.lecture.review.R2209.R220922;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchBFSR220922 {
    Node root;

    public static void main(String[] args) {
        BinarySearchBFSR220922 binarySearchBFSR220922 = new BinarySearchBFSR220922();
        binarySearchBFSR220922.root = new Node(1);
        binarySearchBFSR220922.root.lt = new Node(2);
        binarySearchBFSR220922.root.rt = new Node(3);
        binarySearchBFSR220922.root.lt.lt = new Node(4);
        binarySearchBFSR220922.root.lt.rt = new Node(5);
        binarySearchBFSR220922.root.rt.lt = new Node(6);
        binarySearchBFSR220922.root.rt.rt = new Node(7);
        binarySearchBFSR220922.solution(binarySearchBFSR220922.root);
    }

    private void solution(Node root) {
        bfs(root);
    }

    private void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node poll = q.poll();
                System.out.print(poll.data + " ");
                if(poll.lt!=null) q.add(poll.lt);
                if(poll.rt!=null) q.add(poll.rt);
            }
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
