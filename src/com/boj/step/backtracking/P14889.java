package com.boj.step.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class P14889 {

    int[][] array;
    boolean[] visit;
    int count;
    int minValue = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        P14889 p14889 = new P14889();
        p14889.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        count = Integer.parseInt(br.readLine());
        array = new int[count][count];
        visit = new boolean[count];

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < count; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            };
        }

        dfs(0,  0);
        bw.write(String.valueOf(minValue));
        bw.flush();
        bw.close();
        br.close();

    }

    private void dfs(int index, int depth) {
        if (depth == count/2) {
            getMinValue();
            return;
        }
        for (int i = index; i < count; i++) {
            if (!visit[i]) visit[i] = true;
            dfs(i+1, depth+1);
            visit[i] = false;
        }
    }

    private void getMinValue() {
        int startTeam = 0;
        int linkTeam = 0;

        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if(i==j) continue;
                if (visit[i] == true && visit[j] == true) {
                    startTeam = startTeam + array[i][j] + array[j][i];
                }
                else if (visit[i] == false && visit[j] == false) {
                    linkTeam = linkTeam + array[i][j] + array[j][i];
                }
                }
            }

        int tempMinValue = Math.abs(startTeam - linkTeam);

        minValue = Math.min(tempMinValue, minValue);
    }

}
