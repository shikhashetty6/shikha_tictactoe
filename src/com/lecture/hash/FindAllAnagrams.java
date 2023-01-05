package com.lecture.hash;

import java.util.HashMap;
import java.util.Scanner;

public class FindAllAnagrams {
    public static void main(String[] args) {
        FindAllAnagrams findAllAnagrams = new FindAllAnagrams();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(findAllAnagrams.solution(a, b));
    }

    private int solution(String a, String b) {
        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();
        int answer = 0;
        for (char c : b.toCharArray()) {
            bMap.put(c, bMap.getOrDefault(c, 0)+1);
        }
        int L = b.length()-1;
        int lt = 0;
        for(int i=0; i<L; i++) aMap.put(a.charAt(i), aMap.getOrDefault(a.charAt(i), 0)+1);
        for(int i=L; i<a.length(); i++){
            aMap.put(a.charAt(i), aMap.getOrDefault(a.charAt(i), 0)+1);
            if(aMap.equals(bMap)) answer++;
            aMap.put(a.charAt(lt), aMap.get(a.charAt(lt))-1);
            if(aMap.get(a.charAt(lt))==0) aMap.remove(a.charAt(lt));
            lt++;
        }

        return answer;
    }
}
