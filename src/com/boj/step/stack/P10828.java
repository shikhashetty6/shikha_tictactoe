package com.boj.step.stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class P10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack stack = new Stack();

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            String message = st.nextToken();
            if (message.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if(message.equals("pop")) {
                if (stack.empty()) {
                    bw.write(String.valueOf(-1));
                } else{
                    bw.write(String.valueOf(stack.pop()));
                }
                bw.newLine();
            } else if(message.equals("size")) {
                bw.write(String.valueOf(stack.size()));
                bw.newLine();
            } else if(message.equals("empty")) {
                if (stack.empty()) {
                    bw.write(String.valueOf(1));
                } else{
                    bw.write(String.valueOf(0));
                }
                bw.newLine();
            } else if(message.equals("top")) {
                if (stack.empty()) {
                    bw.write(String.valueOf(-1));
                } else{
                    bw.write(String.valueOf(stack.peek()));
                }
                bw.newLine();
            }

        }
        bw.flush();
        bw.close();
        br.close();

    }
}
