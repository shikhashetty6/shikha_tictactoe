package com.lecture.dfsbfsbasic;

public class ShortestPathDFS {

    Node root;
    private int dfs(int L, Node root) {
        if (root.lt == null && root.rt == null) return L;
        else return Math.min(dfs(L+1, root.lt), dfs(L+1, root.rt));
    }

    public static void main(String[] args) {
        ShortestPathDFS tree = new ShortestPathDFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.dfs(0, tree.root));
    }

}
