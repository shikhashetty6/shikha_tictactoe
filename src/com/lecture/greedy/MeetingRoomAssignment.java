package com.lecture.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Meeting implements Comparable<Meeting>{
    public int s;
    public int e;
    public Meeting(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Meeting o) {
//        if (this.s > o.s) {
//            return this.s - o.s;
//        } else if()
//        return o.s+this.s;
        return 1;
    }
}

public class MeetingRoomAssignment {

    static int n;
    static ArrayList<Meeting> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        MeetingRoomAssignment meetingRoomAssignment = new MeetingRoomAssignment();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            int tempS = kb.nextInt();
            int tempE = kb.nextInt();
            arrayList.add(new Meeting(tempS, tempE));
        }
        meetingRoomAssignment.solution();
    }

    private void solution() {
        Collections.sort(arrayList);
        for (Meeting meeting : arrayList) {
            System.out.println("s: "+meeting.s +" e: "+ meeting.e);
        }
    }
}
