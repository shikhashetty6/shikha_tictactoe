package com.lecture.review.R0502;

import java.util.Scanner;

public class FindDuplicatePermutation0502 {

    private static int n, m;

    private void dfs(int L, int ch[]) {
        if (L == m) {
            for (int i = 1; i <= n; i++) {
                if(ch[i]==1) System.out.print((i+1)+" ");
            }
            System.out.println();
        }
        else {
            for (int i = 1; i <= n; i++) {
                ch[i] = 1;
                dfs(L+1, ch);
                ch[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        FindDuplicatePermutation0502 findDuplicatePermutation0502 = new FindDuplicatePermutation0502();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        findDuplicatePermutation0502.dfs(0, new int[n+1]);
    }

}
