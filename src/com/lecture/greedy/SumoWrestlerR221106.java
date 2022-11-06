package com.lecture.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumoWrestlerR221106 {

    public static void main(String[] args) {
        SumoWrestlerR221106 T = new SumoWrestlerR221106();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(T.solution(arr, n));
    }

    private int solution(ArrayList<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Body ob : arr) {
            if (ob.w > max) {
                max=ob.w;
                cnt++;
            }
        }
        return cnt;
    }

}
