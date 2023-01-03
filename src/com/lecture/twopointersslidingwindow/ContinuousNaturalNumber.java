package com.lecture.twopointersslidingwindow;

import java.util.Scanner;

public class ContinuousNaturalNumber {
    public static void main(String[] args) {
        ContinuousNaturalNumber continuousNaturalNumber = new ContinuousNaturalNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(continuousNaturalNumber.solution(n));
    }

    private int solution(int n) {
        int answer = 0, sum = 0, lt = 0;
        int m = n/2+1;
        int[] array = new int[n];
        for(int i=0; i<m; i++){
            array[i] = i+1;
        }
        for(int rt=0; rt<n; rt++){
            sum+=array[rt];
            if(sum==n) answer++;
            while(sum>=n){
                sum-=array[lt++];
                if(sum==n) answer++;
            }
        }
        return answer;
    }
}
