package com.lecture.review.R2209.R220924;

import java.util.ArrayList;
import java.util.Scanner;

public class PathSearchArrayListR220924 {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static int[] ch;
    static int n,m,answer;

    public static void main(String[] args) {
        PathSearchArrayListR220924 pathSearchArrayListR220924 = new PathSearchArrayListR220924();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        ch = new int[n+1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        pathSearchArrayListR220924.solution();
    }

    private void solution() {
        ch[1]=1;
        dfs(1);
        System.out.println(answer);
    }

    private void dfs(int v) {
        if(v==n) answer++;
        else {
                for (int i : graph.get(v)) {
                    if(ch[i] == 0) {
                        ch[i]=1;
                        dfs(i);
                        ch[i]=0;
                    }
                }
        }
    }
}
