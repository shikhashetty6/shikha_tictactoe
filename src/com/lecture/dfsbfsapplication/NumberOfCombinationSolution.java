package com.lecture.dfsbfsapplication;

import java.util.Scanner;

public class NumberOfCombinationSolution {

    int[][] dy = new int[35][35];

    private int dfs(int n, int r) {
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r] = dfs(n-1, r-1)+dfs(n-1, r);
    }

    public static void main(String[] args) {
        NumberOfCombinationSolution numberOfCombinationSolution = new NumberOfCombinationSolution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(numberOfCombinationSolution.dfs(n, r));
    }

}
