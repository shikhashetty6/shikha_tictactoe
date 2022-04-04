package com.lecture.dfsbfsbasic;

import java.util.ArrayList;
import java.util.Scanner;

public class PathSearchArrayList {

    /**
     * 정점의 개수가 많으면 ArrayList로 구현한다.
     */

    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v) {
        if(v==n) answer++;
        else{
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        PathSearchArrayList pathSearchArrayList = new PathSearchArrayList();
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
        ch[1] = 1;
        pathSearchArrayList.DFS(1);
        System.out.println(answer);
    }
}
