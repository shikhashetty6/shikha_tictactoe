package com.lecture.review.R0421;

import java.util.Scanner;

public class SubSetting0421 {

    static int n;
    static int[] ch;

    public static void main(String[] args) {
        SubSetting0421 subSetting = new SubSetting0421();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        ch = new int[n+1];
        subSetting.dfs(1);
    }

    private void dfs(int input) {

        if (input == n + 1) {
            for (int i = 1; i <= n; i++) {
                if(ch[i]==1) System.out.print(i + " ");
            }
            System.out.println();
        } else{
            ch[input] = 1;
            dfs(input+1);
            ch[input] = 0;
            dfs(input+1);
        }
    }
}
