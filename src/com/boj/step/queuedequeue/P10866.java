package com.boj.step.queuedequeue;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P10866 {

    Deque<Integer> deque = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        P10866 p10866 = new P10866();
        p10866.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push_back")) {
                int value = Integer.parseInt(st.nextToken());
                deque.addLast(value);
            } else if (command.equals("push_front")) {
                int value = Integer.parseInt(st.nextToken());
                deque.addFirst(value);
            } else if (command.equals("pop_front")) {
                if (deque.isEmpty()) {
                    bw.write("-1");
                } else{
                    bw.write(String.valueOf(deque.pollFirst()));
                }
                bw.newLine();
            } else if (command.equals("pop_back")) {
                if (deque.isEmpty()) {
                    bw.write("-1");
                } else{
                    bw.write(String.valueOf(deque.pollLast()));
                }
                bw.newLine();
            } else if (command.equals("size")) {
                bw.write(String.valueOf(deque.size()));
                bw.newLine();
            } else if (command.equals("empty")) {
                if (deque.isEmpty()) {
                    bw.write("1");
                } else{
                    bw.write("0");
                }
                bw.newLine();
            } else if (command.equals("front")) {
                if (deque.isEmpty()) {
                    bw.write("-1");
                } else{
                    bw.write(String.valueOf(deque.peekFirst()));
                }
                bw.newLine();
            } else if (command.equals("back")) {
                if (deque.isEmpty()) {
                    bw.write("-1");
                } else{
                    bw.write(String.valueOf(deque.peekLast()));
                }
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
