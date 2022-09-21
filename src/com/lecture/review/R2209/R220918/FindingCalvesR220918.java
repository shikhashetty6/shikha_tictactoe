package com.lecture.review.R2209.R220918;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindingCalvesR220918 {

    private int[] length = {1, -1, 5};
    int[] ch = new int[10001];

    public static void main(String[] args) {
        FindingCalvesR220918 findingCalvesR220918 = new FindingCalvesR220918();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(findingCalvesR220918.solution(s, e));
    }

    private int solution(int s, int e) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        ch[s] = 1;
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for(int i=0; i<len; i++){
                Integer poll = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = poll + length[j];
                    if(nx==e) return L+1;
                    if(nx>=1 && nx<=10000 && ch[nx]==0){
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }
}
