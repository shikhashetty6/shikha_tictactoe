package com.boj.step.queuedequeue;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P1966 {

    int n;
    int m;
    StringTokenizer st;
    LinkedList<int[]> queue;

    public static void main(String[] args) throws IOException {
        P1966 p1966 = new P1966();
        p1966.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            queue = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                queue.offer(new int[] {j, Integer.parseInt(st.nextToken()) });
            }
            int order = 0;
            while (!queue.isEmpty()) {

                int[] front = queue.poll();
                boolean isMax = true;

                for(int k = 0; k < queue.size(); k++) {

                    if(front[1] < queue.get(k)[1]) {

                        queue.offer(front);
                        for(int l = 0; l < k; l++) {
                            queue.offer(queue.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if(isMax == false) {
                    continue;
                }

                order++;
                if(front[0] == m) {
                    break;
                }
            }
            bw.write(String.valueOf(order));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
