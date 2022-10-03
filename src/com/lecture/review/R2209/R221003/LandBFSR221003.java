package com.lecture.review.R2209.R221003;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LandBFSR221003 {

    static int answer=0, n;
    static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
    static int[][] array;

    public static void main(String[] args) {
        LandBFSR221003 landBFS221003 = new LandBFSR221003();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = kb.nextInt();
            }
        }
        landBFS221003.solution();
        System.out.println(answer);
    }

    private void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == 1) {
                    array[i][j] = 0;
                    answer++;
                    bfs(i, j);
                }
            }
        }
    }

    private void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        while (!queue.isEmpty()) {
            Point poll = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && array[nx][ny]==1){
                    array[nx][ny]=0;
                    queue.add(new Point(nx, ny));
                }
            }
        }
    }

    class Point{
        int x, y;
        Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
}
