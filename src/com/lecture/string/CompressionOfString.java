package com.lecture.string;

import java.util.Scanner;

public class CompressionOfString {
    public static void main(String[] args) {
        CompressionOfString compressionOfString = new CompressionOfString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(compressionOfString.solution(str));
    }

    private String solution(String str) {
        str = str+" "; //빈 문자 넣는 스킬!
        char[] chars = str.toCharArray();
        int cnt = 0;
        String answer = "";
        for (int i = 0; i < str.length()-1; i++) {
            cnt++;
            if (chars[i] != chars[i + 1]) {
                if (cnt == 1) answer += (String.valueOf(chars[i]));
                else answer += (String.valueOf(chars[i])+cnt);
                cnt = 0;
            }
        }
        return answer;
    }
}
