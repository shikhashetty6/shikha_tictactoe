package com.lecture.review;

import com.lecture.dfsbfsbasic.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeCircuitBFS0421 {

    Node root;

    public static void main(String[] args) {
        BinaryTreeCircuitBFS0421 tree = new BinaryTreeCircuitBFS0421();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.bfs();
    }

    private void bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                Node poll = queue.poll();
                System.out.print(poll.data + " ");
                if(poll.lt != null) queue.add(poll.lt);
                if(poll.rt != null) queue.add(poll.rt);
            }
        }
    }
}
