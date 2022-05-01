package com.lecture.review.R0501;

import java.util.ArrayList;
import java.util.Scanner;

public class PathSearchAdjacentList0501 {

    private static int n, m, count = 0;
    private static ArrayList<ArrayList<Integer>> graph;
    private static int[] ch;

    private void dfs(int v) {
        if(v==n) count++;
        else{
            for (Integer integer : graph.get(v)) {
                if (ch[integer] == 0) {
                    ch[integer] = 1;
                    dfs(integer);
                    ch[integer] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        PathSearchAdjacentList0501 pathSearchAdjacentList0501 = new PathSearchAdjacentList0501();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<>();
        ch = new int[n+1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int tempX = kb.nextInt();
            int tempY = kb.nextInt();
            graph.get(tempX).add(tempY);
        }

        ch[1] = 1;
        pathSearchAdjacentList0501.dfs(1);
        System.out.println(count);
    }
}
