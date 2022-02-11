package com.boj.step.queuedequeue;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P11866 {
    private Queue<Integer> queue;
    private ArrayList<Integer> array;

    public static void main(String[] args) throws IOException {
        P11866 p11866 = new P11866();
        p11866.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        queue = new LinkedList<>();
        array = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (true) {
            if (queue.isEmpty()) {
                break;
            }
            int poll = 0;
                for (int i = 0; i < k; i++) {
                    poll = queue.poll();
                    if (i != k-1) {
                        queue.add(poll);
                    }
                }
                array.add(poll);
            }

        bw.write("<");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                bw.write(String.valueOf(array.get(i)));
            } else{
                bw.write(array.get(i) + ", ");
            }
        }
        bw.write(">");

        bw.flush();
        bw.close();
        br.close();
    }
}
