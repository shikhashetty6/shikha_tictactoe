package com.boj.step.stack;

import java.io.*;
import java.util.Stack;

public class P4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack stack;

        while(true){
            String s = br.readLine();
            if(s.equals(".")){
                break;
            }
            stack = new Stack();
            for(int i=0; i<s.length(); i++){
                String input = s.substring(i, i+1);
                if (input.equals("(")) {
                    stack.push(input);
                } else if(input.equals(")")){
                    if (!stack.empty() && stack.peek().equals("(")) {
                        stack.pop();
                    } else{
                        stack.push(input);
                    }
                } else if (input.equals("[")) {
                    stack.push(input);
                } else if(input.equals("]")){
                    if (!stack.empty() && stack.peek().equals("[")) {
                        stack.pop();
                    } else{
                        stack.push(input);
                    }
                }

            }
            if(stack.empty()){
                bw.write("yes");
            } else{
                bw.write("no");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

