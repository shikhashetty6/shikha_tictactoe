package com.lecture.review.R2209.R220922;

import java.util.Scanner;

public class BinaryR220922 {

    public static void main(String[] args) {
        BinaryR220922 binaryR220922 = new BinaryR220922();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        binaryR220922.solution(n);
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
