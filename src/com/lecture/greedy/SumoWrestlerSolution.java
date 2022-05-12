package com.lecture.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {

    public int h, w;

    public Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h-this.h; // 내림차순정렬
    }
}

public class SumoWrestlerSolution {

    public static void main(String[] args) {
        SumoWrestlerSolution sumoWrestlerSolution = new SumoWrestlerSolution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(sumoWrestlerSolution.solution(arr, n));
    }

    private int solution(ArrayList<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Body ob : arr) {
            if(ob.w>max){
                max = ob.w;
                cnt++;
            }
        }
        return cnt;
    }
}
