package com.lecture.queue;

import java.util.LinkedList;
import java.util.Scanner;

public class SavingPrincesses {
    public static void main(String[] args) {
        SavingPrincesses savingPrincesses = new SavingPrincesses();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(savingPrincesses.solution(n, k));
    }

    private int solution(int n, int k) {
        int answer = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++){
            queue.add(i);
        }
        while (!queue.isEmpty()){
            for(int i=1; i<k; i++) queue.offer(queue.poll());
            queue.poll();
            if(queue.size()==1) answer = queue.poll();
        }
        return answer;
    }
}
