package com.lecture.dfsbfsapplication;

import java.util.Scanner;

public class AGameOfGoSolution {

    static int answer = Integer.MIN_VALUE, c, n;

    private void dfs(int L, int sum, int[] arr) {
        if (sum > c) return;
        if (L == n) {
            answer = Math.max(answer, sum);
        }
        else{
            dfs(L+1, sum+arr[L], arr);
            dfs(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        AGameOfGoSolution aGameOfGoSolution = new AGameOfGoSolution();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        aGameOfGoSolution.dfs(0,0,arr);
        System.out.println(answer);
    }

}
