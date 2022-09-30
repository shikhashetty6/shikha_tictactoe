package com.lecture.review.R2209.R220929;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TomatoR220930 {
    static int n, m, answer;
    static int[][] array;
    static int[][] dis;
    static int[] disX = {0, 1, 0, -1};
    static int[] disY = {1, 0, -1, 0};
    public static void main(String[] args) {
        TomatoR220930 tomatoR220930 = new TomatoR220930();
        Scanner kb = new Scanner(System.in);
        m = kb.nextInt();
        n = kb.nextInt();
        array = new int[n][m];
        dis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = kb.nextInt();
            }
        }
        tomatoR220930.solution();
    }

    private void solution() {
        boolean flag = true;
        bfs();
        int answer = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(array[i][j]==0) flag=false;
            }
        }
        if (flag) {
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    answer=Math.max(answer, dis[i][j]);
                }
            }
        } else{
            System.out.println(-1);
        }
        System.out.println(answer);
    }

    private void bfs() {
        Queue<Point> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] == 1) {
                    queue.add(new Point(i, j));
                }
            }
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point poll = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = poll.x + disX[j];
                    int ny = poll.y + disY[j];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && array[nx][ny] == 0) {
                        array[nx][ny] = 1;
                        queue.add(new Point(nx, ny));
                        dis[nx][ny] = dis[poll.x][poll.y]+1;
                    }
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
