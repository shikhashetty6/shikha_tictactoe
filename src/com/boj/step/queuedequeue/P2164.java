package com.boj.step.queuedequeue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class P2164 {

    private Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        P2164 p2164 = new P2164();
        p2164.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        queue = new LinkedList<>();

        for (int i = 1; i <= input; i++) {
            queue.add(i);
        }

        while (true) {
            if (queue.size()==1) {
                break;
            }
            queue.poll();
            Integer poll = queue.poll();
            queue.add(poll);
        }
        bw.write(String.valueOf(queue.peek()));
        bw.flush();
        bw.close();
        br.close();

    }
}
