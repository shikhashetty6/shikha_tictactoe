package com.lecture.review.R0502;

import java.util.Scanner;

public class AGameOfGo0502 {

    private static int c, n, answer = Integer.MIN_VALUE;
    private static int[] array;

    private void dfs(int L, int sum) {
        if(sum>c) return;
        if (L == n) {
            //if(sum>answer) answer = sum;
            //-> Math.max(sum, answer);
            answer = Math.max(sum, answer);
        }
        else{
            dfs(L+1, sum+array[L]);
            dfs(L+1, sum);
        }

    }


    public static void main(String[] args) {
        AGameOfGo0502 aGameOfGo0502 = new AGameOfGo0502();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = kb.nextInt();
        }

        aGameOfGo0502.dfs(0, 0);
        System.out.println(answer);
    }

}
