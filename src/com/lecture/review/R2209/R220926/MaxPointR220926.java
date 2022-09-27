package com.lecture.review.R2209.R220926;

import java.util.Scanner;

public class MaxPointR220926 {
    static int n,m, answer;
    static int[] point, time;

    public static void main(String[] args) {
        MaxPointR220926 maxPointR220926 = new MaxPointR220926();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        point = new int[n];
        time = new int[n];
        for (int i = 0; i < n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            point[i] = a;
            time[i] = b;
        }
        maxPointR220926.solution();
    }

    private void solution() {
        dfs(0, 0, 0);
        System.out.println(answer);
    }

    private void dfs(int L, int sumPoint, int sumTime) {
        if(L==n){
            if (sumTime <= m) {
                answer = Math.max(sumPoint, answer);
            }
        }else{
            dfs(L+1, sumPoint+point[L], sumTime+time[L]);
            dfs(L+1, sumPoint, sumTime);
        }
    }
}
