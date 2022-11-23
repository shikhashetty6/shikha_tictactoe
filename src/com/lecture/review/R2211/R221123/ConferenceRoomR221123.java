package com.lecture.review.R2211.R221123;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ConferenceRoomR221123 {
    public static void main(String[] args) {
        ConferenceRoomR221123 conferenceRoomR221123 = new ConferenceRoomR221123();
        Scanner kb = new Scanner(System.in);
        ArrayList<Conference> arrayList = new ArrayList<>();
        int n = kb.nextInt();
        for(int i=0; i<n; i++){
            int s = kb.nextInt();
            int e = kb.nextInt();
            arrayList.add(new Conference(s,e));
        }

        System.out.println(conferenceRoomR221123.solution(arrayList, n));
    }

    private int solution(ArrayList<Conference> arrayList, int n) {
        int count = 0;
        Collections.sort(arrayList);
        int et=0;
        for(Conference ob : arrayList){
            if(ob.s>=et){
                count++;
                et=ob.e;
            }
        }
        return count;
    }
}

class Conference implements Comparable<Conference>{

    int s, e;

    public Conference(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Conference o) {
        if(this.e==o.e) return this.s-o.s;
        return this.e-o.e;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "s=" + s +
                ", e=" + e +
                '}';
    }
}
