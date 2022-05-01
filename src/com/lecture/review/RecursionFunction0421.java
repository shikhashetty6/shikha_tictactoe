package com.lecture.review;

import java.util.Scanner;

public class RecursionFunction0421 {
    static int n;
    public static void main(String[] args) {
        RecursionFunction0421 recursionFunction0421 = new RecursionFunction0421();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        recursionFunction0421.dfs(n);
    }

    private void dfs(int input) {
        if(input==0) return;
        else {
            dfs(input-1);
            System.out.print(input + " ");
        }
    }
}
