package com.lecture.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaseConversion {

    private String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
//            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//            else answer += Character.toLowerCase(x);
            if (x >= 97 && x <= 122) answer += (char)(x-32);
            else answer += (char)(x+32);

        }
            return answer;
    }

    public static void main(String[] args) throws IOException {
        CaseConversion caseConversion = new CaseConversion();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(caseConversion.solution(str));
    }

}
