package com.boj.step.stack;

import java.io.*;
import java.util.Stack;

public class P1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int index = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < count; i++) {
            int value = Integer.parseInt(br.readLine());
                if (index < value) {
                    for (int j = index + 1; j <= value; j++) {
                        stack.push(j);
                        bw.write("+");
                        bw.newLine();
                    }
                    index = value;
                }
                else if (!(stack.peek().equals(value))) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
                bw.write("-");
                bw.newLine();
            }
        bw.flush();
        bw.close();
        br.close();
    }
}
