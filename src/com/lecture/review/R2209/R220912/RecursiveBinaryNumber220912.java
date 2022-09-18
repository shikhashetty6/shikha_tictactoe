package com.lecture.review.R2209.R220912;

import java.util.Scanner;

public class RecursiveBinaryNumber220912 {

    public static void main(String[] args) {
        RecursiveBinaryNumber220912 recursiveBinaryNumber220912 = new RecursiveBinaryNumber220912();
        Scanner kb = new Scanner(System.in);
        Integer n = kb.nextInt();
        recursiveBinaryNumber220912.solution(n);
    }

    private void solution(int n) {
        dfs(n);
    }

    private void dfs(int n) {
        if(n==0) return;
        else{
            dfs(n/2);
            System.out.print(n%2 + "");
        }
    }
}
