package com.lecture.review;

import java.util.Scanner;

public class RecursionBinary0421 {

    private static int n;

    public static void main(String[] args) {
        RecursionBinary0421 recursionBinary0421 = new RecursionBinary0421();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        recursionBinary0421.dfs(n);
    }

    private void dfs(int input) {
        if(input==0) return;
        else{
            dfs(input/2);
            System.out.print(input%2);
        }
    }
}
