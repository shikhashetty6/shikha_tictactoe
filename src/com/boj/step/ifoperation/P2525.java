package com.boj.step.ifoperation;

import java.io.*;
import java.util.StringTokenizer;

public class P2525 {
    public static void main(String[] args) throws IOException {
        P2525 p2525 = new P2525();
        p2525.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int hours = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());

        int addMinutes = Integer.parseInt(br.readLine());

        int resultMinutes = minutes + addMinutes;
        int resultHours = 0;
        if (resultMinutes >= 60) {
            resultHours = hours + (resultMinutes/60);
            resultMinutes = resultMinutes%60;
        } else {
            resultHours = hours;
        }
        if (resultHours >= 24) {
            resultHours = resultHours%24;
        }

        bw.write(resultHours+" "+resultMinutes);
        bw.flush();
        bw.close();
        br.close();
    }
}
