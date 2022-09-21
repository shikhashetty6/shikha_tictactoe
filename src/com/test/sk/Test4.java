package com.test.sk;

import com.lecture.dfsbfsapplication.MazeExplorationBFS;

import java.util.LinkedList;
import java.util.Queue;

public class Test4 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int sizeX;
    static int sizeY;
    static int answer = 0;
    static int minCount = Integer.MAX_VALUE;
    static String[][] newGrid;
    static int maxMove;

    public static void main(String[] args) {
        Test4 test4 = new Test4();
//        String[] grid = {"..FF", "###F", "###."};
//        int k = 4;

//        String[] grid = {"..FF", "###F", "###."};
//        int k = 5;
//
        String[] grid = {".F.FFFFF.F", ".########.",
        ".########F", "...######F", "##.######F",
        "...######F", ".########F", ".########.",
        ".#...####F", "...#......"};
        int k = 6;
        test4.solution(grid, k);
    }

    public int solution(String[] grid, int k) {
        answer = 0;
        maxMove = k;
        String[] split = grid[0].split("");
        newGrid = new String[51][51];
        sizeX = grid.length;
        sizeY = split.length;
        for (int i = 1; i <= grid.length; i++) {
            String[] temp = grid[i-1].split("");
            for (int j = 1; j <= split.length; j++) {
                newGrid[i][j] = temp[j-1];
            }
        }

        dfs(1, 1, k, 0);
        if(minCount==Integer.MAX_VALUE) answer = 0;
        else answer = minCount;
        return answer;
    }

    public void dfs(int x, int y, int move, int count) {
        if (x == sizeX && y == sizeY) {
            minCount = Math.min(minCount, count);
        }
        else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= sizeX && ny >= 1 && ny <=sizeY && (newGrid[nx][ny].equals(".") || newGrid[nx][ny].equals("F")) && move > 0) {
                    if(newGrid[nx][ny].equals(".")){
                        String temp = newGrid[nx][ny];
                        newGrid[nx][ny]="#";
                        dfs(nx, ny, maxMove, count+1);
                        newGrid[nx][ny]=temp;
                    }
                    String temp = newGrid[nx][ny];
                    newGrid[nx][ny]="#";
                    dfs(nx, ny, move-1, count);
                    newGrid[nx][ny]=temp;
                }
            }
        }
    }
}
