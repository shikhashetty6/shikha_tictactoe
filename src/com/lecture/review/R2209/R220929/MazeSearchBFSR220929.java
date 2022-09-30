package com.lecture.review.R2209.R220929;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeSearchBFSR220929 {

    static int n,m, answer;
    static int[][] maze = new int[7][7];
    static int[][] dis = new int[7][7];
    static int[] disX = {0, 1, 0, -1};
    static int[] disY = {1, 0, -1, 0};

    public static void main(String[] args) {
        MazeSearchBFSR220929 mazeSearchBFSR220929 = new MazeSearchBFSR220929();
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                maze[i][j] = kb.nextInt();
            }
        }
        mazeSearchBFSR220929.solution();
    }

    private void solution() {
        bfs(0, 0);
        if(dis[6][6]==0) System.out.println(-1);
        else System.out.println(dis[6][6]);
    }

    private void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        maze[0][0] = 1;
        while (!queue.isEmpty()) {
            Point poll = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx=poll.x+disX[i];
                int ny=poll.y+disY[i];
                if(nx>=0 && nx<=6 && ny>=0 && ny<=6 && maze[nx][ny]==0){
                    maze[nx][ny]=1;
                    queue.offer(new Point(nx, ny));
                    dis[nx][ny]=dis[poll.x][poll.y]+1;
                }
            }
        }
    }

    class Point{
        public int x, y;
        Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
}
