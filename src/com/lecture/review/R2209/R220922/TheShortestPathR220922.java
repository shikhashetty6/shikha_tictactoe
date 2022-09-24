package com.lecture.review.R2209.R220922;

import java.util.LinkedList;
import java.util.Queue;

public class TheShortestPathR220922 {
    Node root;
    public static void main(String[] args) {
        TheShortestPathR220922 theShortestPathR220922 = new TheShortestPathR220922();
        theShortestPathR220922.root = new Node(1);
        theShortestPathR220922.root.lt = new Node(2);
        theShortestPathR220922.root.rt = new Node(3);
        theShortestPathR220922.root.lt.lt = new Node(4);
        theShortestPathR220922.root.lt.rt = new Node(5);
        theShortestPathR220922.solution(theShortestPathR220922.root);

    }

    private void solution(Node root) {
        bfs(root);
    }

    private void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                if (poll.lt == null && poll.rt == null) {
                    System.out.print(L);
                    return;
                }
                if(poll.lt!=null) queue.add(poll.lt);
                if(poll.rt!=null) queue.add(poll.rt);
            }
            L++;
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
