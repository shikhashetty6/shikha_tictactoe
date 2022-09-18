package com.lecture.review.R2209.R220913;

import java.util.Scanner;

public class Subset220914 {

    static int n;
    static int[] ch;

    public static void main(String[] args) {
        Subset220914 subset220914 = new Subset220914();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        subset220914.solution(n);
    }

    private void solution(int n) {
        ch = new int[n+1];
        dfs(1);

    }

    private void dfs(int L) {
        if(L==n+1){
            for (int i = 1; i <= n; i++) {
                if(ch[i]!=0){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            return;
        }
        else{
            ch[L]=1;
            dfs(L+1);
            ch[L]=0;
            dfs(L+1);
        }

    }
}
