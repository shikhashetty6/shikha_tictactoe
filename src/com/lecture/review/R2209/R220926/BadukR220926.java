package com.lecture.review.R2209.R220926;

import java.util.Scanner;

public class BadukR220926 {

    static int[] array;
    static int answer, n, c;

    public static void main(String[] args) {
        BadukR220926 badukR220926 = new BadukR220926();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = kb.nextInt();
        }
        badukR220926.solution();
    }

    private void solution() {
        dfs(0, 0);
        System.out.println(answer);
    }

    private void dfs(int L, int sum) {
        if(L==n){
            if(sum<=c){
                answer = Math.max(sum, answer);
            }
        }else{
            dfs(L+1, sum+array[L]);
            dfs(L+1, sum);
        }
    }
}
