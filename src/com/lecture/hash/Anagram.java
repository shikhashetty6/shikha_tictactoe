package com.lecture.hash;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(anagram.solution(a, b));
    }

    private String solution(String a, String b) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char temp : a.toCharArray()) {
            map.put(temp, map.getOrDefault(temp, 0)+1);
        }
        for (char temp : b.toCharArray()) {
            if(!map.containsKey(temp) || map.get(temp)==0) return "NO";
            map.put(temp, map.get(temp)-1);
        }
        return answer;


    }
}
