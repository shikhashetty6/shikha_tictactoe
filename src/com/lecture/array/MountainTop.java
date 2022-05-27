package com.lecture.array;

import java.util.Scanner;

public class MountainTop {
    public static void main(String[] args) {
        MountainTop mountainTop = new MountainTop();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] array = new int[n+2][n+2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                array[i][j] = kb.nextInt();
            }
        }
        System.out.println(mountainTop.solution(n, array));
    }

    private int solution(int n, int[][] array) {
        int answer = 0;
        int[] x = {0, 1, 0, -1};
        int[] y = {1, 0, -1, 0};
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                boolean flag = false;
                for (int k = 0; k < 4; k++) {
                    if(flag) break;
                    int tmp = array[i+x[k]][j+y[k]];
                    if(array[i][j]<=tmp) flag = true;
                }
                if(!flag) answer++;
            }
        }
        return answer;
    }
}
