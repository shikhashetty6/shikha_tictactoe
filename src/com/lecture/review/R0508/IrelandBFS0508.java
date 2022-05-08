package com.lecture.review.R0508;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IrelandBFS0508 {

    static int n, answer;
    static int[][] board;
    static Queue<Point> queue = new LinkedList<>();
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    static class Point{
        public int x;
        public int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private void bfs() {
        while (!queue.isEmpty()) {
            Point poll = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.add(new Point(nx, ny));
                }
            }
        }
    }


    public static void main(String[] args) {
        IrelandBFS0508 irelandBFS0508 = new IrelandBFS0508();
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
                if(board[i][j]==1) {
                    board[i][j]=0;
                    queue.add(new Point(i, j));
                    irelandBFS0508.bfs();
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

}
