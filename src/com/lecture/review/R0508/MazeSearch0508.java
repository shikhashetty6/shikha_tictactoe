package com.lecture.review.R0508;

import java.util.Scanner;

public class MazeSearch0508 {

    static int answer;
    static int[][] maze = new int[8][8];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    private void dfs(int x, int y) {
        if (x == 7 && y == 7) {
            answer++;
        } else{
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
        MazeSearch0508 mazeSearch0508 = new MazeSearch0508();
        Scanner kb = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                maze[i][j] = kb.nextInt();
            }
        }
        maze[1][1] = 1;
        mazeSearch0508.dfs(1, 1);
        System.out.println(answer);
    }

}
