package com.lecture.review.R0506;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeShortestDistance0506 {

    public class Point{
        public int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int[][] maze = new int[8][8];
    private static int[][] dis = new int[8][8];
    private static int answer;
    private static Queue<Point> queue = new LinkedList<>();

    private void bfs(int x, int y) {
        queue.add(new Point(x, y));
        while (!queue.isEmpty()) {
            Point poll = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx >= 1 && nx<=7 && ny>=1 && ny<=7 && maze[nx][ny] == 0){
                    maze[nx][ny] = 1;
                    queue.add(new Point(nx, ny));
                    dis[nx][ny] = dis[poll.x][poll.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        MazeShortestDistance0506 mazeShortestDistance = new MazeShortestDistance0506();
        Scanner kb = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                maze[i][j] = kb.nextInt();
            }
        }
        maze[1][1] = 1;
        mazeShortestDistance.bfs(1, 1);
        if(dis[7][7]==0) System.out.println("-1");
        else System.out.println(dis[7][7]);
    }

}
