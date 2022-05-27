package com.lecture.array;

import java.util.Scanner;

public class MountainTopSolution {
    int[] dx= {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        MountainTopSolution mountainTopSolution = new MountainTopSolution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = kb.nextInt();
            }
        }
        System.out.println(mountainTopSolution.solution(n, array));
    }

    private int solution(int n, int[][] array) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx>=0 && nx<n && ny >=0 && ny<n && array[nx][ny]>=array[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }
}
