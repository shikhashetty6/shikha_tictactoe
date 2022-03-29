package com.lecture.dfsbfsbasic;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathBFS {

    Node root;
    private int bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node current = q.poll();
                if(current.lt == null && current.rt == null) return L;
                if(current.lt != null) q.offer(current.lt);
                if(current.rt != null) q.offer(current.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        ShortestPathBFS tree = new ShortestPathBFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.bfs(tree.root));
    }
}
