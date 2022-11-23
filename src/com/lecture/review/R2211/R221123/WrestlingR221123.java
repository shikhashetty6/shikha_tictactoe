package com.lecture.review.R2211.R221123;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WrestlingR221123 {

    public static void main(String[] args) {
        WrestlingR221123 wrestlingR221123 = new WrestlingR221123();
        Scanner kb = new Scanner(System.in);
        ArrayList<Body> arrayList = new ArrayList<>();
        int n = kb.nextInt();
        for(int i=0; i<n; i++){
            int h = kb.nextInt();
            int w = kb.nextInt();
            arrayList.add(new Body(h, w));
        }
        Collections.sort(arrayList);
        System.out.println(wrestlingR221123.solution(arrayList, n));
    }

    private int solution(ArrayList<Body> arrayList, int n) {
        int count = 0;
        Collections.sort(arrayList);
        int max = Integer.MIN_VALUE;
        for (Body body : arrayList) {
            if(body.w>max){
                max = body.w;
                count++;
            }
        }
        return count;
    }
}

class Body implements Comparable<Body>{
    public int h, w;
    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h-this.h;
    }

    @Override
    public String toString() {
        return "Body{" +
                "h=" + h +
                ", w=" + w +
                '}';
    }

}
