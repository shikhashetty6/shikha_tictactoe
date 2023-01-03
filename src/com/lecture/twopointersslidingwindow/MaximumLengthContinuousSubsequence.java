package com.lecture.twopointersslidingwindow;

import java.util.Scanner;

public class MaximumLengthContinuousSubsequence {
    public static void main(String[] args) {
        MaximumLengthContinuousSubsequence maximumLengthContinuousSubsequence = new MaximumLengthContinuousSubsequence();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = kb.nextInt();
        }
        System.out.println(maximumLengthContinuousSubsequence.solution(n, k, array));
    }

    private int solution(int n, int k, int[] array) {
        int answer = 0, cnt = 0, lt = 0;
        for(int rt=0; rt<n; rt++){
            if(array[rt]==0) cnt++;
            while(cnt>k){
                if(array[lt]==0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }
}
