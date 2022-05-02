package com.lecture.review.R0502;

import java.util.Scanner;

public class FindTheMaximumScore0502 {

    private static int n, m, answer = Integer.MIN_VALUE;
    private static int[] scoreArray, timeArray;

    private void dfs(int L, int[] ch) {
        if (L == n) {
            checkSum(ch);
        }
        else{
            ch[L] = 1;
            dfs(L+1, ch);
            ch[L] = 0;
            dfs(L+1, ch);
        }
    }

    private void checkSum(int[] ch) {
        int scoreSum = 0, timeSum = 0;
        for (int i = 0; i < n; i++) {
            if(ch[i]==1) {
                scoreSum += scoreArray[i];
                timeSum += timeArray[i];
            }
        }
        if(timeSum>m) return;
        else answer = Math.max(scoreSum, answer);
    }


    public static void main(String[] args) {
        FindTheMaximumScore0502 findTheMaximumScore0502 = new FindTheMaximumScore0502();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        scoreArray = new int[n];
        timeArray = new int[n];
        for (int i = 0; i < n; i++) {
            scoreArray[i] = kb.nextInt();
            timeArray[i] = kb.nextInt();
        }
        findTheMaximumScore0502.dfs(0, new int[n]);
        System.out.println(answer);
    }
}
