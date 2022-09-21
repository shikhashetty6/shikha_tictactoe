package com.lecture.review.R2209.R220918;

import java.util.LinkedList;
import java.util.Queue;

public class TheShortestPathDFSR220918 {
    public static void main(String[] args) {
        TheShortestPathDFSR220918 theShortestPathR220918 = new TheShortestPathDFSR220918();
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt =  new Node(4);
        root.lt.rt = new Node(5);
        theShortestPathR220918.solution(root);
    }

    private void solution(Node root) {
        System.out.println(dfs(0, root));
    }

    private int dfs(int L, Node root) {
        if(root.lt==null && root.rt==null) return L;
        else{
            return Math.min(dfs(L+1, root.lt), dfs(L+1, root.rt));
        }
    }


    static class Node{
        int data;
        TheShortestPathDFSR220918.Node lt, rt;

        public Node(int data) {
            this.data = data;
            lt=rt=null;
        }
    }
}
