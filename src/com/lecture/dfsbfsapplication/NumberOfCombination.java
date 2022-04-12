package com.lecture.dfsbfsapplication;

import java.util.Scanner;

public class NumberOfCombination {

    static int n, r;
    static int[][] memo;

    private int dfs(int inputN, int inputR) {
        if(memo[inputN][inputR]!=0) return memo[inputN][inputR];
        if(inputR==inputN) return memo[inputN][inputR] = 1;
        if(inputR==0) return memo[inputN][inputR] = 1;
        else return dfs(inputN-1, inputR-1) + dfs(inputN-1, inputR);
    }

    public static void main(String[] args) {
        NumberOfCombination numberOfCombination = new NumberOfCombination();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        r = kb.nextInt();
        memo = new int[n+1][r+1];
        System.out.println(numberOfCombination.dfs(n, r));
    }
}
