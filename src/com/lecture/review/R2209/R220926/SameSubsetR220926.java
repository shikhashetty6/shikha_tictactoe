package com.lecture.review.R2209.R220926;

import java.util.Scanner;

public class SameSubsetR220926 {

    static int[] array;
    static int total, n;
    static boolean flag;
    static String answer;

    public static void main(String[] args) {
        SameSubsetR220926 sameSubsetR220926 = new SameSubsetR220926();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = kb.nextInt();
            total += array[i];
        }
        sameSubsetR220926.solution();
    }

    private void solution() {
        dfs(0, 0);
        System.out.println(answer);
    }

    private void dfs(int L, int sum) {
        if (flag) {
            return;
        }
        if (sum > (total / 2)) {
            return;
        }
        if(L==n){
            if(sum == (total/2)){
                answer = "YES";
                flag = true;
            }
        }else{
            dfs(L+1, sum+array[L]);
            dfs(L+1, sum);
        }
    }
}
