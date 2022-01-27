package com.boj.step.stack;

import java.io.*;
import java.util.Stack;

public class P10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack stack = new Stack();
        int result = 0;

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                stack.pop();
            } else{
                stack.push(input);
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            result += (int)stack.get(i);
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
