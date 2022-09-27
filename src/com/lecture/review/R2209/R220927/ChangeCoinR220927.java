package com.lecture.review.R2209.R220927;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChangeCoinR220927 {
    static Integer[] array;
    static int n, m, answer = Integer.MAX_VALUE;
    public static void main(String[] args) {
        ChangeCoinR220927 changeCoinR220927 = new ChangeCoinR220927();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        array = new Integer[n];
        for (int i = 0; i < n; i++) {
            int a = kb.nextInt();
            array[i] = a;
        }
        m = kb.nextInt();
        Arrays.sort(array, Collections.reverseOrder());
        changeCoinR220927.solution();
    }

    private void solution() {
        dfs(0,0);
        System.out.println(answer);
    }

    private void dfs(int L, int sum) {
        if(sum>m){
            return;
        }
        if(L>=answer) return;
        if (sum==m) {
            answer = Math.min(L, answer);
        } else {
            for (int i = 0; i < n; i++) {
                dfs(L + 1, sum + array[i]);
            }
        }
    }
}
