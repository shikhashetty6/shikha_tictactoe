package com.lecture.review.R0502;

import java.util.Scanner;

public class FindDuplicatePermutation0502 {

    private static int n, m;

    private void dfs(int L, int ch[]) {
        if (L == m) {
            for (int i = 0; i <= m-1; i++) {
                if(ch[i]!=0) System.out.print((ch[i])+" ");
            }
            System.out.println();
        }
        else {
            for (int i = 1; i <= n; i++) {
                ch[L] = i;
                dfs(L+1, ch);
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
