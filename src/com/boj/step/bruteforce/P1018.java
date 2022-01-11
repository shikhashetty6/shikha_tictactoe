package com.boj.step.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());

        Integer m = Integer.parseInt(stringTokenizer.nextToken());
        Integer n = Integer.parseInt(stringTokenizer.nextToken());

        boolean[][] array = new boolean[m][n];
        int minCount = 63;
        for (int i = 0; i < m; i++) {
            String line = bf.readLine();
            for (int j = 0; j < n; j++) {
                if (line.substring(j, j + 1).equals("W")) array[i][j] = true;
                else array[i][j] = false;}}

        for (int a = 0; a < m - 7; a++) {
            for (int b = 0; b < n - 7; b++) {
                int count = 0;
                boolean temp = array[a][b];
                for (int c = a; c < a + 8; c++) {
                    for (int d = b; d < b + 8; d++) {
                        if (array[c][d] != temp) count++;
                        temp = !temp;}
                    temp = !temp;}

                count = Math.min(count, 64 - count);
                minCount = Math.min(minCount, count);}}

        System.out.println(minCount);
    }
}
