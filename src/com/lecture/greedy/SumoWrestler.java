package com.lecture.greedy;

import java.util.Scanner;

public class SumoWrestler {

    static int n, answer = Integer.MIN_VALUE;
    static int[] key, weight;

    public static void main(String[] args) {
        SumoWrestler sumoWrestler = new SumoWrestler();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        key = new int[n];
        weight = new int[n];

        for (int i = 0; i < n; i++) {
            key[i] = kb.nextInt();
            weight[i] = kb.nextInt();
        }
        answer = n;
        for (int i = 0; i < n; i++) {
            int aKey = key[i];
            int aWeight = weight[i];
            for (int j = 0; j < n; j++) {
                if(i==j) continue;
                if(key[j]>aKey && weight[j]>aWeight) {
                    answer--;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
