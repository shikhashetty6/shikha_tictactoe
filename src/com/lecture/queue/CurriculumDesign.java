package com.lecture.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CurriculumDesign {
    public static void main(String[] args) {
        CurriculumDesign curriculumDesign = new CurriculumDesign();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(curriculumDesign.solution(a, b));
    }

    private String solution(String a, String b) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char c : a.toCharArray()) {
            queue.offer(c);
        }
        for(char x : b.toCharArray()){
            if(queue.contains(x)){
                if(x!=queue.poll()) return "NO";
            }
        }
        if(!queue.isEmpty()) return "NO";
        return answer;
    }
}
