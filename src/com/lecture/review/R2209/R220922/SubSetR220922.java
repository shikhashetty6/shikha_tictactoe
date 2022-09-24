package com.lecture.review.R2209.R220922;

import java.util.Scanner;

public class SubSetR220922 {

    static int[] ch;
    static int n;
    public static void main(String[] args) {
        SubSetR220922 subSetR220922 = new SubSetR220922();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        ch = new int[n+1];
        subSetR220922.solution(n);
    }

    private void solution(int n) {
        dfs(1);
    }

    private void dfs(int a) {
        if (a > n) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] != 0) {
                    tmp += (i+" ");
                }
            }
            if(tmp.length()>0) System.out.println(tmp);
        } else {
            ch[a] = 1;
            dfs(a+1);
            ch[a] = 0;
            dfs(a+1);
        }
    }
}
