package com.lecture.dfsbfsapplication;

import java.util.Scanner;

public class Permutation {

    static int n, m;
    static int[] array;
    static int[] tempArray;
    static boolean flag;

    private void dfs(int L) {
        if (L == m) {
            for(int i=0; i<m; i++) System.out.print(tempArray[i]+" ");
            System.out.println();
            return;
        }
        else{
            for (int i = 0; i < n; i++) {
                flag = false;
                for (int j = 0; j < L; j++) {
                if(array[i]==tempArray[j]) {
                    flag = true;
                    break;
                }
                }
                if (flag) continue;
                tempArray[L] = array[i];
                dfs(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        array = new int[n];
        tempArray = new int[m];
        for (int i = 0; i < n; i++) array[i] = kb.nextInt();
        permutation.dfs(0);
    }
}
