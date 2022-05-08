package com.lecture.review.R0508;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeShortestPath0508 {

    static int answer;
    static int[][] maze = new int[8][8];
    static int[][] board = new int[8][8];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    private void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x,y));
        while (!queue.isEmpty()) {
            Point poll = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    queue.add(new Point(nx,ny));
                    board[nx][ny] = board[poll.x][poll.y] + 1;
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
        MazeShortestPath0508 mazeShortestPath0508 = new MazeShortestPath0508();
        Scanner kb = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                maze[i][j] = kb.nextInt();
            }
        }
        maze[1][1] = 1;
        mazeShortestPath0508.bfs(1, 1);
        System.out.println(board[7][7]);
    }

}
