package com.lecture.review.R2209.R220918;

import java.util.ArrayList;
import java.util.Scanner;

public class PathNavigationArrayListR220918 {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static int[] ch;
    static int answer, n, m;

    public static void main(String[] args) {
        PathNavigationArrayListR220918 pathNavigationArrayListR220918 = new PathNavigationArrayListR220918();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        pathNavigationArrayListR220918.dfs(1);
        System.out.println(answer);
    }

    public void dfs(int v){
        if(v==n) answer++;
        else{
            for(int nv : graph.get(v)){
                if(ch[nv]==0){
                    ch[nv]=1;
                    dfs(nv);
                    ch[nv]=0;
                }
            }
        }
    }
}
