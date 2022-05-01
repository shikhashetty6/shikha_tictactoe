package com.lecture.review.R0421;

import com.lecture.dfsbfsbasic.Node;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath0421 {

    Node root;
    static int L = 0;

    public static void main(String[] args) {
        ShortestPath0421 tree = new ShortestPath0421();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.bfs();
        System.out.println(L);
    }

    private int bfs() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node poll = queue.poll();
                if(poll.lt==null && poll.rt==null) return L;
                if(poll.lt!=null) queue.add(poll.lt);
                if(poll.rt!=null) queue.add(poll.rt);
            }
            L++;
        }
        return L;
    }
}
