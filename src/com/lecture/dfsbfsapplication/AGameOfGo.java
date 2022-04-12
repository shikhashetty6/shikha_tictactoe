package com.lecture.dfsbfsapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AGameOfGo {

    private static int c;
    private static int n;
    private static Integer max = Integer.MIN_VALUE;
    private static int[] array;

    private void dfs(int i, int sum) {

        if (i == n + 1) {
            if (max < sum && c>=sum) {
                max = sum;
            }
        }else{
            dfs(i+1, sum + array[i]);
            dfs(i+1, sum);
        }
    }

    public static void main(String[] args) throws IOException {
        AGameOfGo aGameOfGo = new AGameOfGo();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        array = new int[n+1];
        for (int i = 1; i <= n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        aGameOfGo.dfs(1, 0);
        System.out.println(max);
    }

}
