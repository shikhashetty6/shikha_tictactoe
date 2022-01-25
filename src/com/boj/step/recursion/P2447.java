package com.boj.step.recursion;

import java.io.*;

public class P2447 {
    public char[][] array;

    public static void main(String[] args) throws IOException {
        P2447 p2447 = new P2447();
        p2447.solve();
    }

    private void solve() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer input = Integer.parseInt(bf.readLine());

        array = new char[input][input];

        addStar(0, 0, input, false);

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                bw.write(String.valueOf(array[i][j]));
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();

    }

    public void addStar(int a, int b, int size, boolean blank) {

        if (blank) {
            for (int i = a; i < a + size; i++) {
                for (int j = b; j < b + size; j++) {
                    array[i][j] = ' ';
                }
            }
            return;
        }

        if (size == 1) {
            array[a][b] = '*';
            return;
        }

        int changedSize = size/3;
        int count =0;

        for (int i = a; i < a + size; i += changedSize) {
            for (int j = b; j < b + size; j += changedSize) {
                count++;
                if (count == 5) {
                    addStar(i, j, changedSize ,true);
                } else{
                    addStar(i, j, changedSize ,false);
                }
            }
        }
    }

}
