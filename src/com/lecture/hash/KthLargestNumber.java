package com.lecture.hash;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class KthLargestNumber {
    public static void main(String[] args) {
        KthLargestNumber kthLargestNumber = new KthLargestNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = kb.nextInt();
        }
        System.out.println(kthLargestNumber.solution(n, k, array));
    }

    private int solution(int n, int k, int[] array) {
        int answer = -1;
        int cnt = 0;
        TreeSet<Integer> tSet = new TreeSet<Integer>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    tSet.add((array[i]+array[j]+array[l]));
                }
            }
        }
        for(int x : tSet){
            cnt++;
            if(cnt==k) return x;
        }
        return answer;
    }
}
