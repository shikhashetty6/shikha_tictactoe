package com.lecture.review.R0421;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Calf0421 {

    private static int s,e, L=1;
    private static int[] jump = {1, -1, 5};
    private static int[] ch = new int[10001]; // 방문했던 숫자는 방문하지 않기 위함

    public static void main(String[] args) {
        Calf0421 calf0421 = new Calf0421();
        Scanner kb = new Scanner(System.in);
        s = kb.nextInt();
        e = kb.nextInt();
        System.out.println(calf0421.bfs());
    }

    private int bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int j = 0; j < len; j++) {
                Integer poll = queue.poll();
                for (int i = 0; i < 3; i++) {
                    int nx = poll + jump[i];
                    if(nx == e) return L;
                    if(nx >= 1 || nx <= 10000 || ch[nx]==0){
                        ch[nx] = 1;
                        queue.add(poll + jump[i]);
                    }
                }
            }
            L++;
        }
        return L;
    }
}
