package com.lecture.dfsbfsapplication;

import java.util.Scanner;

public class MazeExploration {

    private static int[][] array = new int[8][8];
    private static int count = 0;

    private void dfs(int x, int y) {

        if (x == 7 && y == 7) count++;
        else {
            if ((((x) >= 1) && ((x) <= 7)) && (((y - 1) >= 1) && ((y - 1) <= 7))) {
                if (array[x][y - 1] == 0) {
                    array[x][y - 1] = 1;
                    dfs(x, y - 1);
                    array[x][y - 1] = 0;
                }
            }
            if (((((x) >= 1) && ((x) <= 7)) && (((y + 1) >= 1) && ((y + 1) <= 7)))) {
                if (array[x][y + 1] == 0) {
                    array[x][y + 1] = 1;
                    dfs(x, y + 1);
                    array[x][y + 1] = 0;
                }
            }
            if ((((x - 1) >= 1) && ((x - 1) <= 7)) && (((y) >= 1) && ((y) <= 7))) {
                if (array[x - 1][y] == 0) {
                    array[x - 1][y] = 1;
                    dfs(x - 1, y);
                    array[x - 1][y] = 0;
                }
            }
                if ((((x + 1) >= 1) && ((x + 1) <= 7)) && (((y) >= 1) && ((y) <= 7))) {
                    if (array[x + 1][y] == 0) {
                        array[x + 1][y] = 1;
                        dfs(x + 1, y);
                        array[x + 1][y] = 0;
                    }
            }
        }
    }

    public static void main(String[] args) {
        MazeExploration mazeExploration = new MazeExploration();
        Scanner kb = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                array[i][j] = kb.nextInt();
            }
        }
        array[1][1] = 1;

        mazeExploration.dfs(1, 1);
        System.out.println(count);
    }
}
