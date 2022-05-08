package com.lecture.review.R0508;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato0508 {

    static int m, n;
    static int[][] board, dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Point> queue = new LinkedList<>();

    private void bfs() {
        while (!queue.isEmpty()) {
            Point poll = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[poll.x][poll.y] + 1;
                }
            }
        }
    }
    static class Point{
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Tomato0508 tomato0508 = new Tomato0508();
        Scanner kb = new Scanner(System.in);
        m = kb.nextInt();
        n = kb.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = kb.nextInt();
                if(board[i][j] == 1) queue.add(new Point(i,j));
            }
        }

        tomato0508.bfs();
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
