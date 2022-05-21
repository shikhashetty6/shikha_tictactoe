package com.lecture.string;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Code code = new Code();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String codeString = kb.next();
        code.solution(n, codeString);
    }

    private void solution(int n, String codeString) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tempString = codeString.substring((i*7), (i*7)+7);
            String intTemp = "";
            for (int j = 0; j < 7; j++) {
                if(tempString.substring(j, j+1).equals("#")){
                    intTemp += "1";
                } else{
                    intTemp += "0";
                }
            }
            int parseInt = Integer.parseInt(intTemp, 2);
            System.out.print((char)parseInt);
        }

    }
}
