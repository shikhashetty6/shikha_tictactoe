package com.lecture.hash;

import java.util.HashMap;
import java.util.Scanner;

public class ClassPresident {
    public static void main(String[] args) {
        ClassPresident classPresident = new ClassPresident();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String s;
        s = kb.next();
        System.out.println(classPresident.solution(n, s));
    }

    private String solution(int n, String s) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i=0; i<n; i++){
            String tempString = s.substring(i,i+1);
            if(hashMap.containsKey(tempString)){
                hashMap.put(tempString, hashMap.get(tempString)+1);
            } else hashMap.put(tempString, 1);
        }
        int maxValue = Integer.MIN_VALUE;
        for (String temp : hashMap.keySet()) {
            if(hashMap.get(temp) > maxValue){
                maxValue = hashMap.get(temp);
                answer = temp;
            }
        }

        return answer;
    }
}
