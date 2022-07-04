package com.lecture.twopointersslidingwindow;

import java.util.ArrayList;
import java.util.Scanner;

public class CombiningTwoArrays {
    public static void main(String[] args) {
        CombiningTwoArrays combiningTwoArrays = new CombiningTwoArrays();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) array1[i] = kb.nextInt();
        int m = kb.nextInt();
        int[] array2 = new int[m];
        for (int i = 0; i < m; i++) array2[i] = kb.nextInt();
        for (int temp : combiningTwoArrays.solution(n, array1, m, array2)) {
            System.out.print(temp + " ");
        }
    }

    private ArrayList<Integer> solution(int n, int[] array1, int m, int[] array2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int nCount = 0, mCount = 0;
        for(int j=0; j<n+m; j++) {
            if (nCount == n) {
                arrayList.add(array2[mCount]);
                mCount++;
            } else if (mCount == m) {
                arrayList.add(array1[nCount]);
                mCount++;
            } else {
                if (array1[nCount] < array2[mCount]) {
                    arrayList.add(array1[nCount]);
                    nCount++;
                } else {
                    arrayList.add(array2[mCount]);
                    mCount++;
                }
            }
        }
        return arrayList;
    }
}
