package com.boj.step.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class ReviewP14889 {

    int count;
    int[][] array;
    boolean[] visit;
    int minValue = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        ReviewP14889 reviewP14889 = new ReviewP14889();
        reviewP14889.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        count = Integer.parseInt(br.readLine());
        array = new int[count][count];
        visit = new boolean[count];
        StringTokenizer st;

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < count; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        backTracking(0, 0);
        bw.write(String.valueOf(minValue));
        bw.flush();
        bw.close();
        br.close();

    }

    private void backTracking(int index, int depth) {
        if (depth == count/2) {
            getMinValue();
            return;
        }

        for (int i = index; i < count; i++) {
            if(!visit[i]) visit[i] = true;
            backTracking(i+1, depth+1);
            visit[i] = false;
        }

    }

    private void getMinValue() {
        int startTeamPoint = 0;
        int linkTeamPoint = 0;

        for (int i = 0; i < count - 1; i++) {
            for (int j = i+1; j < count; j++) {
                if (visit[i] && visit[j]) {
                    startTeamPoint = array[i][j] + array[j][i];
                } else if (!visit[i] && !visit[j]) {
                    linkTeamPoint = array[i][j] + array[j][i];
                }
            }
        }
        int val = Math.abs(startTeamPoint - linkTeamPoint);
        if (val == 0) {
            minValue = 0;
            return;
        }
        Math.min(minValue, val);
    }

}
