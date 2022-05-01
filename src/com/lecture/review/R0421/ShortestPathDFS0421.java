package com.lecture.review.R0421;

import com.lecture.dfsbfsbasic.Node;

public class ShortestPathDFS0421 {
    Node root;
    public static void main(String[] args) {
        ShortestPathDFS0421 tree = new ShortestPathDFS0421();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.dfs(tree.root, 0));
    }

    private int dfs(Node node, int L) {
        if (node.lt == null && node.rt == null) return L;
        else return Math.min(dfs(node.lt, L+1), dfs(node.rt, L+1));
    }
}
