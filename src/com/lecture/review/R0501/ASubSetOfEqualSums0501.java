package com.lecture.review.R0501;

import java.util.Scanner;

public class ASubSetOfEqualSums0501 {

    private static int n, totalSum;
    private static int[] array;
    private static boolean flag;
    private static String answer = "NO";

    private void dfs(int L, int sum) {

        if(flag) return;
        if(sum>totalSum/2) return;
        if (L == n) {
            if ((totalSum / 2) == sum) {
                answer = "YES";
                flag = true;
                return;
            }
        }
        else{
            dfs(L+1, array[L]+sum);
            dfs(L+1, sum);
        }

    }

    public static void main(String[] args) {
        ASubSetOfEqualSums0501 aSubSetOfEqualSums0501 = new ASubSetOfEqualSums0501();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = kb.nextInt();
            totalSum += array[i];
        }
        aSubSetOfEqualSums0501.dfs(0, 0);
        System.out.println(answer);
    }


}
