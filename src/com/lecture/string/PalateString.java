package com.lecture.string;

import java.util.Scanner;

public class PalateString {
    public static void main(String[] args) {
        PalateString palateString = new PalateString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(palateString.solution(str));
    }

    private String solution(String str) {
        String tmpStr = str.toUpperCase();
        String reverseStr = new StringBuilder(tmpStr).reverse().toString();
        if(tmpStr.equals(reverseStr)) return "YES";
        else return "NO";
    }
}
