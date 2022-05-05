package com.lecture.review.R0504;

import java.util.Scanner;

public class FindThePermutation0504 {

    private static int n, m;
    private static int[] array, ch, pm;

    private void dfs(int L) {

        if(L==m){
            for (int i : pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        }else{
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = array[i];
                    dfs(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        FindThePermutation0504 findThePermutation0504 = new FindThePermutation0504();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        array = new int[n];
        ch = new int[n];
        pm = new int[m];
        for (int i = 0; i < n; i++) {
            array[i] = kb.nextInt();
        }
        findThePermutation0504.dfs(0);
    }

}
