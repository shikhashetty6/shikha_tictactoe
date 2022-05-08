package com.lecture.review.R0505;

import java.util.Scanner;

public class MazeSearch0505 {

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int[][] maze = new int[8][8];
    private static int answer;

    private void dfs(int x, int y) {
        if (x == 7 && y == 7) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    dfs(nx, ny);
                    maze[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        MazeSearch0505 mazeSearch0505 = new MazeSearch0505();
        Scanner kb = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                maze[i][j] = kb.nextInt();
            }
        }
        maze[1][1] = 1;
        mazeSearch0505.dfs(1, 1);
        System.out.println(answer);
    }

}
