package com.lecture.string;

import java.util.ArrayList;
import java.util.Scanner;

public class ShortestTextDistance {
    public static void main(String[] args) {
        ShortestTextDistance shortestTextDistance = new ShortestTextDistance();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        String t = kb.next();
        shortestTextDistance.solution(s, t);
    }

    private void solution(String s, String t) {
        ArrayList<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i + 1);
            if(str.charAt(0)==t.charAt(0)){
                indexList.add(i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            int answer = Integer.MAX_VALUE;
            for (Integer integer : indexList) {
                answer = Math.min(Math.abs(i - integer), answer);
            }
            System.out.print(answer + " ");
        }
    }
}
