package com.lecture.dfsbfsapplication;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IslandNationBFS {

    static int answer = 0, n;
    private static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    Queue<Point> queue = new LinkedList<>();

    public class Point{
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private void bfs(int x, int y, int[][] board) {
        queue.add(new Point(x, y));
        while (!queue.isEmpty()) {
            Point pos = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0; // 그 섬은 다 육지로 바꾸는 것
                    queue.add(new Point(nx, ny));
                }
            }
        }
    }


    public void solution(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    bfs(i, j, board);
                }
            }
        }
    }

    public static void main(String[] args) {
        IslandNationBFS islandNationBFS = new IslandNationBFS();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        islandNationBFS.solution(arr);
        System.out.println(answer);
    }

}
