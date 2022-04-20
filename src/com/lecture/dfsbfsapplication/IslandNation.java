package com.lecture.dfsbfsapplication;

import java.util.Scanner;

public class IslandNation {

    private static int n, answer;
    private static int[][] board;
    private static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
    private static int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};

    private void dfs(int x, int y) {

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        IslandNation islandNation = new IslandNation();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    islandNation.dfs(i, j);
                }
            }
        }

        System.out.println(answer);
    }
}
