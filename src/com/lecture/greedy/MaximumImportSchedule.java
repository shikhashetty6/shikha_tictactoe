package com.lecture.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumImportSchedule {
    static int n, max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        MaximumImportSchedule maximumImportSchedule = new MaximumImportSchedule();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int m=kb.nextInt();
            int d=kb.nextInt();
            arr.add(new Lecture(m, d));
            if(d>max) max=d;
        }
        System.out.println(maximumImportSchedule.solution(n, arr));
    }

    private int solution(int n, ArrayList<Lecture> arr) {

        int answer=0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j=0;
        for(int i=max; i>=1; i--){
            for(; j<n; j++){
                if(arr.get(j).time<i) break;
                pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()) answer+=pQ.poll();
        }
        return answer;

    }
}
class Lecture implements Comparable<Lecture>{
    public int money;
    public int time;

    public Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(Lecture ob){
        return ob.time-this.time;
    }
}