package com.boj.step.stack;

import java.io.*;
import java.util.Stack;

public class P9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        Stack stack;

        for (int i = 0; i < count; i++) {
            stack = new Stack();
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                String substring = input.substring(j, j + 1);
                if (substring.equals("(")) {
                    stack.push(substring);
                } else if(substring.equals(")")){
                    if (!stack.empty() && !stack.peek().equals(")")) {
                        stack.pop();
                    } else{
                        stack.push(substring);
                    }
                }
            }
            if(stack.empty()){
                bw.write("YES");
            } else{
                bw.write("NO");
            }

            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
