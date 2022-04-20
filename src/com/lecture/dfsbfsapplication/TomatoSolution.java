package com.lecture.dfsbfsapplication;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TomatoSolution {

    public static class Point{
        public int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int m, n;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;
    static Queue<Point> q = new LinkedList<>();

    private void bfs() {
        while (!q.isEmpty()) {
            Point point = q.poll();
            for (int j = 0; j < 4; j++) {
                int nx = point.x + dx[j];
                int ny = point.y + dy[j];
                if (nx >= 0 && nx < n && ny >= 0 && ny <m && board[nx][ny]==0) {
                    board[nx][ny]=1;
                    q.add(new Point(nx, ny));
                    dis[nx][ny] = dis[point.x][point.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        TomatoSolution tomatoSolution = new TomatoSolution();
        Scanner kb = new Scanner(System.in);
        m = kb.nextInt();
        n = kb.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = kb.nextInt();
                if (board[i][j] == 1) q.offer(new Point(i, j));
            }
        }
        tomatoSolution.bfs();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j]==0) flag = false;
            }
        }
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        } else{
            System.out.println(-1);
        }
    }
}
