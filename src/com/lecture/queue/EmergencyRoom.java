package com.lecture.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EmergencyRoom {
    public static void main(String[] args) {
        EmergencyRoom emergencyRoom = new EmergencyRoom();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i]= kb.nextInt();
        }
        System.out.println(emergencyRoom.solution(n, m, array));
    }

    private int solution(int n, int m, int[] array) {
        Queue<Person> queue = new LinkedList<>();
        int answer = 0;
        for(int i=0; i<n; i++){
            queue.add(new Person(i, array[i]));
        }
        while (!queue.isEmpty()){
            Person temp = queue.poll();
            for(Person x : queue){
                if(x.priority>temp.priority){
                    queue.offer(temp);
                    temp=null;
                    break;
                }
            }
            if(temp!=null){
                answer++;
                if(temp.id==m) return answer;
            }
        }
        return answer;
    }

    class Person{
        private int id;
        private int priority;
        public Person(int id, int priority){
            this.id=id;
            this.priority=priority;
        }
    }
}
