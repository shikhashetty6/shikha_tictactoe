package com.lecture.review.R2209.R220922;

import java.util.Scanner;

public class RecursiveFunctionR220922 {

    public static void main(String[] args) {
        RecursiveFunctionR220922 recursiveFunctionR220922 = new RecursiveFunctionR220922();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        recursiveFunctionR220922.solution(n);
    }

    private void solution(int n) {
        dfs(n);
    }

    private void dfs(int n) {
        if(n==0) return;
        else{
            dfs(n-1);
            System.out.print(n + " ");
        }
    }
}
