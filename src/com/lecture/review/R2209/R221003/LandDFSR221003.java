package com.lecture.review.R2209.R221003;

import java.util.Scanner;

public class LandDFSR221003 {

    static int[][] array;
    static int n, answer;
    static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) {
        LandDFSR221003 landR221003 = new LandDFSR221003();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = kb.nextInt();
            }
        }
        landR221003.solution();
    }

    private void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == 1) {
                    answer++;
                    array[i][j] = 0;
                    dfs(i, j);
                }
            }
        }
        System.out.println(answer);
    }

    private void dfs(int x, int y) {
        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny>=0 && ny<n && array[nx][ny]==1){
                array[nx][ny]=0;
                dfs(nx, ny);
            }
        }
    }
}
