package com.lecture.review.R0501;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphShortestDistance0501 {

    private static int n, m, count = 0;
    private static ArrayList<ArrayList<Integer>> graph;
    private static int[] ch;
    private static Queue<Integer> q;

    private int bfs(int e) {
        int L = 0;
        ch = new int[n+1];
        q = new LinkedList<>();
        q.add(1);
        while(!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Integer poll = q.poll();
                for (Integer integer : graph.get(poll)) {
                    if(integer==e) return L+1;
                    if(ch[integer] == 0) {
                        ch[integer]=1;
                        q.add(integer);
                    }
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        GraphShortestDistance0501 graphShortestDistance0501 = new GraphShortestDistance0501();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        for (int i = 2; i <= n; i++) {
            System.out.println(i+" : " + graphShortestDistance0501.bfs(i));
        }
    }

}
