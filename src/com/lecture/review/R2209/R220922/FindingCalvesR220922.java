package com.lecture.review.R2209.R220922;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindingCalvesR220922 {
    static int[] dis = {1, -1, 5};
    static int n, m;

    public static void main(String[] args) {
        FindingCalvesR220922 findingCalvesR220922 = new FindingCalvesR220922();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        findingCalvesR220922.solution(n, m);
    }

    private void solution(int n, int m) {
        dfs(n);
    }

    private void dfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        int L = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer poll = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int nextInt = poll + dis[j];
                    if (nextInt == m) {
                        System.out.println(L++);
                        return;
                    }
                    queue.add(poll+dis[j]);
                }
            }
            L++;
        }
    }
}
