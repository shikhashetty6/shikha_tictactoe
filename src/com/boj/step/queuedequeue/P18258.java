package com.boj.step.queuedequeue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P18258 {

    private Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        P18258 p18258 = new P18258();
        p18258.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        queue = new LinkedList<>();
        int last = 0;

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                Integer value = Integer.valueOf(st.nextToken());
                queue.add(value);
                last = value;
            } else if (command.equals("pop")) {
                Integer poll = queue.poll();
                if (poll == null) {
                    bw.write("-1");
                } else if (poll != null) {
                    bw.write(String.valueOf(poll));
                }
                bw.newLine();
            } else if (command.equals("size")) {
                bw.write(String.valueOf(queue.size()));
                bw.newLine();
            } else if (command.equals("empty")) {
                if (queue.isEmpty()) {
                    bw.write("1");
                } else if (!queue.isEmpty()) {
                    bw.write("0");
                }
                bw.newLine();
            } else if (command.equals("front")) {
                if (!queue.isEmpty()) {
                    bw.write(String.valueOf(queue.peek()));
                } else if (queue.isEmpty()) {
                    bw.write("-1");
                }
                bw.newLine();
            } else if (command.equals("back")) {
                if (queue.isEmpty()) {
                    bw.write("-1");
                } else if (!queue.isEmpty()) {
                    bw.write(String.valueOf(last));
                }
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
