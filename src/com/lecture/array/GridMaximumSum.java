package com.lecture.array;

import java.util.Scanner;

public class GridMaximumSum {

    public static void main(String[] args) {
        GridMaximumSum gridMaximumSum = new GridMaximumSum();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = kb.nextInt();
            }
        }
        System.out.println(gridMaximumSum.solution(n, array));
    }

    private int solution(int n, int[][] array) {
        int maxRowSum = Integer.MIN_VALUE;
        int maxColumnSum = Integer.MIN_VALUE;
        int firstDiagonalLineSum = 0;
        int secondDiagonalLineSum = 0;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int columnSum = 0;
            for (int j = 0; j < n; j++) {
                if(i==j) firstDiagonalLineSum += array[i][j];
                else if(i+j == 4) secondDiagonalLineSum += array[i][j];
                columnSum += array[j][i];
                rowSum += array[i][j];
            }
            maxRowSum = Math.max(rowSum, maxRowSum);
            maxColumnSum = Math.max(columnSum, maxColumnSum);
        }
        answer = Math.max(maxRowSum, Math.max(maxColumnSum, Math.max(firstDiagonalLineSum, secondDiagonalLineSum)));
        return answer;
    }
}
