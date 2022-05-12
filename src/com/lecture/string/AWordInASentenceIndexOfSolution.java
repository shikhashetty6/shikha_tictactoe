package com.lecture.string;

import java.util.Scanner;

public class AWordInASentenceIndexOfSolution {
    public static void main(String[] args) {
        AWordInASentenceIndexOfSolution aWordInASentenceSplitSolution = new AWordInASentenceIndexOfSolution();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(aWordInASentenceSplitSolution.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE,pos;
        // i가 0번, t가 1번, 띄어쓰기가 2번
        // 띄어쓰기가 없으면 종료
        while ((pos=str.indexOf(' '))!=-1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) { // 같다를 하지 않으면 앞쪽에 있는 단어가 answer가 된다.
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length()>m) answer = str; // 마지막단어처리
        return answer;
    }
}
