package com.lecture.dfsbfsbasic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphShortestDistanceBFS2 {
    static int n, m, L;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v]=1;
        L=0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            System.out.println("cv"+cv);
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv]=1;
                    queue.offer(nv);
                    System.out.println(nv + " : " + L);
                }
            }
            L++;
        }
    }


    public static void main(String[] args) {
        GraphShortestDistanceBFS2 graphShortestDistanceBFS = new GraphShortestDistanceBFS2();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        graphShortestDistanceBFS.BFS(1);
    }
}
