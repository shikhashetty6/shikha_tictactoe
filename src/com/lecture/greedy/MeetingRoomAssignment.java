package com.lecture.greedy;

import java.util.ArrayList;
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
        if (this.e == o.e) return this.s - o.s;
        else return this.e - o.e;
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
            int s = kb.nextInt();
            int e = kb.nextInt();
            arrayList.add(new Meeting(s, e));
        }
        System.out.println(meetingRoomAssignment.solution(arrayList));
    }

    private int solution(ArrayList<Meeting> arrayList) {
        Collections.sort(arrayList);
        int et = 0;
        int cnt = 0;
        for (Meeting meeting : arrayList) {
            if(meeting.s>=et){
                et = meeting.e;
                cnt++;
            }
        }
        return cnt;
    }
}
