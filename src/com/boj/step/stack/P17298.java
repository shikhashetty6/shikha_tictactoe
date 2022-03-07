package com.boj.step.stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class P17298 {

    Stack<Integer> stack;
    int[] array;

    public static void main(String[] args) throws IOException {
        P17298 p17298 = new P17298();
        p17298.solve();
    }
    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        stack = new Stack<>();
        array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < count; i++) {

            while(!stack.isEmpty() && array[stack.peek()] < array[i]) {
                array[stack.pop()] = array[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            array[stack.pop()] = -1;
        }

        for (int i = 0; i < count; i++) {
            bw.write(array[i]+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
