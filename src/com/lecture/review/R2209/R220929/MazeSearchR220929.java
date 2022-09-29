package com.lecture.review.R2209.R220929;

import java.util.Scanner;

public class MazeSearchR220929 {
    static int n,m, answer;
    static int[][] maze = new int[7][7];
    static int[] disX = {0, 1, 0, -1};
    static int[] disY = {1, 0, -1, 0};
    public static void main(String[] args) {
        MazeSearchR220929 mazeSearchR220929 = new MazeSearchR220929();
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                maze[i][j] = kb.nextInt();
            }
        }
        mazeSearchR220929.solution();
    }

    private void solution() {
        maze[0][0] = 1;
        dfs(0, 0);
        System.out.println(answer);
    }

    private void dfs(int x, int y) {
        if (x == 6 && y == 6) {
            answer++;
        } else{
            for (int i = 0; i < 4; i++) {
                int nx = x + disX[i];
                int ny = y + disY[i];
                if (nx >= 0 && ny >= 0 && nx <= 6 && ny <= 6 && maze[nx][ny] != 1) {
                    maze[nx][ny] = 1;
                    dfs(nx, ny);
                    maze[nx][ny] = 0;
                }
            }
        }
    }
}
