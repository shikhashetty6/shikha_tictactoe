package com.lecture.array;

import java.util.Scanner;

public class ProvisionalClassPresident {
    public static void main(String[] args) {
        ProvisionalClassPresident provisionalClassPresident = new ProvisionalClassPresident();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = kb.nextInt();
            }
        }
        System.out.println(provisionalClassPresident.solution(n, array));
    }

    private int solution(int n, int[][] array) {
        int[] member = new int[n+1];
        int answer = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int[] ch = new int[10];
            for (int j = 0; j < n; j++) {
                ch[array[j][i]] += 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if(maxValue < member[i]) answer = i+1;
        }
        return answer;
    }
}
