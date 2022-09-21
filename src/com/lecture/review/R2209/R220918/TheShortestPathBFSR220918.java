package com.lecture.review.R2209.R220918;

import java.util.LinkedList;
import java.util.Queue;

public class TheShortestPathBFSR220918 {
    public static void main(String[] args) {
        TheShortestPathBFSR220918 theShortestPathR220918 = new TheShortestPathBFSR220918();
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt =  new Node(4);
        root.lt.rt = new Node(5);
        theShortestPathR220918.solution(root);
    }

    private void solution(Node root) {
        System.out.println(bfs(root));
    }

    private int bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                if(poll.lt == null && poll.rt == null) return L;
                if(poll.lt!=null) queue.add(poll.lt);
                if(poll.rt!=null) queue.add(poll.rt);
            }
            L++;
        }
        return 0;
    }


    static class Node{
        int data;
        TheShortestPathBFSR220918.Node lt, rt;

        public Node(int data) {
            this.data = data;
            lt=rt=null;
        }
    }
}
