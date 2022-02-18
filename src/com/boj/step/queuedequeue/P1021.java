package com.boj.step.queuedequeue;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class P1021 {

    Deque<Integer> deque;
    Deque<Integer> firstTempDeque;
    Deque<Integer> lastTempDeque;
    int firstCount;
    int lastCount;
    int resultCount;
    int n;
    int m;

    public static void main(String[] args) throws IOException {
        P1021 p1021 = new P1021();
        p1021.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.addLast(i);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            firstTempDeque = new ArrayDeque<>();
            lastTempDeque = new ArrayDeque<>();
            firstTempDeque.addAll(deque);
            lastTempDeque.addAll(deque);
            firstCount = 0;
            lastCount = 0;
            Integer value;
            int order = Integer.parseInt(st.nextToken());
            while (true) {
                value = firstTempDeque.pollFirst();
                if(value.equals(order)){
                    break;
                } else{
                    firstCount++;
                    firstTempDeque.offerLast(value);
                }
            }
            while (true) {
                value = lastTempDeque.peekFirst();
                if (value.equals(order)){
                    lastTempDeque.pollFirst();
                    break;
                } else{
                    lastCount++;
                    Integer integer = lastTempDeque.pollLast();
                    lastTempDeque.offerFirst(integer);
                }
            }
            deque = new ArrayDeque<>();
            if (firstCount > lastCount) {
                resultCount += lastCount;
                deque.addAll(lastTempDeque);
            } else {
                resultCount += firstCount;
                deque.addAll(firstTempDeque);
            }
        }

        bw.write(String.valueOf(resultCount));
        bw.flush();
        bw.close();
        br.close();
    }

}
