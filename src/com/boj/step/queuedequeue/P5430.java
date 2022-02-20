package com.boj.step.queuedequeue;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.StringTokenizer;

public class P5430 {

    ArrayDeque<Integer> deque;

    public static void main(String[] args) throws IOException {
        P5430 p5430 = new P5430();
        p5430.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            boolean isEmpty = false;
            boolean isRight = false;
            int dequeIndex = 0;
            deque = new ArrayDeque<>();
            String command = br.readLine();
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine(), "[,]");
            while (st.hasMoreTokens()) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            for (int j = 0; j < command.length(); j++) {
                if(command.substring(j, j+1).equals("R")){
                    if (isRight) {
                        isRight = false;
                    } else{
                        isRight = true;
                    }
                } else if(command.substring(j, j+1).equals("D")){
                    if (deque.isEmpty()) {
                        isEmpty=true;
                        break;
                    } else{
                        if (isRight) {
                            deque.pollLast();
                        } else{
                            deque.pollFirst();
                        }
                    }
                }
            }

            if (isEmpty) {
                bw.write("error");
            } else{
                bw.write("[");
                if (isRight) {
                    Iterator<Integer> iterator = deque.descendingIterator();
                    while (iterator.hasNext()) {
                        Integer integer = iterator.next();
                        if (dequeIndex + 1 == deque.size()) {
                            bw.write(String.valueOf(integer));
                        } else{
                            bw.write(integer+",");
                        }
                        dequeIndex++;
                    }
                } else{
                    for (Integer integer : deque) {
                        if (dequeIndex + 1 == deque.size()) {
                            bw.write(String.valueOf(integer));
                        } else{
                            bw.write(integer+",");
                        }
                        dequeIndex++;
                    }
                }
                bw.write("]");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

