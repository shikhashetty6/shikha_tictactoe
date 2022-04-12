package com.lecture.dfsbfsapplication;

import java.util.Scanner;

public class DuplicatePermutation {

    static int n,m;
    static int[] array;

    private void dfs(int L, int[] array) {
        if (L == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
        else{
            for (int i = 1; i <= n; i++) {
                array[L] = i;
                dfs(L+1 , array);
                //array[L] = 0;
            }
        }
    }

    public static void main(String[] args) {
        DuplicatePermutation duplicatePermutation = new DuplicatePermutation();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        array = new int[n];
        for (int i = 1; i <= n; i++) {
            array[0]=i;
            duplicatePermutation.dfs(1, array);
            //array[0]=0;
        }
    }


}
