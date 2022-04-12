package com.lecture.dfsbfsapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ASubsetOfEqualSums {

    static int n, aSum, bSum;
    static int[] array;
    static int[] ch;
    static String answer = "NO";

    private void dfs(int v) {
        if (v==n+1){
            check();
            return;
        }
            else {
                ch[v] = 1;
                dfs(v+1);
                ch[v] = 0;
                dfs(v+1);
        }
    }

    public void check() {
        aSum = 0;
        bSum = 0;
        for (int i = 1; i <= n; i++) {
            if (ch[i] == 1) aSum += array[i];
            else bSum += array[i];
        }
        if(aSum == bSum)
            answer = "YES";

    }

    public static void main(String[] args) throws IOException {
        ASubsetOfEqualSums aSubsetOfEqualSums = new ASubsetOfEqualSums();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        array = new int[n+1];
        ch = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++)
            array[i] = Integer.parseInt(st.nextToken());

        aSubsetOfEqualSums.dfs(1);
        System.out.println(answer);

    }

}
