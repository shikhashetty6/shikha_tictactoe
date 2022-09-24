package com.lecture.review.R2209.R220924;

import java.util.LinkedList;
import java.util.Queue;

public class PathSearchR220924 {

    static Node root;

    public static void main(String[] args) {
        PathSearchR220924 pathSearchR220922 = new PathSearchR220924();
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        pathSearchR220922.solution();
    }

    private void solution() {
        System.out.println(bfs(0));
    }

    private int bfs(int L) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                if(poll.lt==null && poll.rt == null) return L;
                if(poll.lt!=null) queue.add(poll.lt);
                if(poll.rt!=null) queue.add(poll.rt);
            }
            L++;
        }
        return 0;
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
