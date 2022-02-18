package com.boj.step.ifoperation;

import java.io.*;
import java.util.StringTokenizer;

public class P2480 {
    int result;
    public static void main(String[] args) throws IOException {
        P2480 p2480 = new P2480();
        p2480.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if ((a == b) && (b == c)){
            result = 10000 + (a * 1000);
        } else if ((a == b) || (b == c) || (a == c)) {
            if (a == b) {
                result = 1000 + (a *100);
            } else if (b == c) {
                result = 1000 + (b *100);
            } else if (a == c) {
                result = 1000 + (a *100);
            }
        } else{
            result = Math.max(Math.max(a, b), c) * 100;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();

    }
}
