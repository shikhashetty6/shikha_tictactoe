package com.lecture.twopointersslidingwindow;

import java.util.Scanner;

public class ContinuousSubsequence {
    public static void main(String[] args) {
        ContinuousSubsequence continuousSubsequence = new ContinuousSubsequence();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int M = kb.nextInt();
        int[] array = new int[N];
        for(int i=0; i<N; i++){
            array[i] = kb.nextInt();
        }
        System.out.println(continuousSubsequence.solution(N, M, array));
    }

    private int solution(int N, int M, int[] array) {
        int answer = 0, sum = 0, lt = 0;
        for(int rt = 0; rt < N; rt++){
            sum += array[rt];
            if(sum==M) answer++;
            while(sum>=M){
                sum-=array[lt++];
                if(sum==M) answer++;
            }
        }
        return answer;
    }
}
