package com.lecture.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicationCheck {
    public static void main(String[] args) {
        DuplicationCheck duplicationCheck = new DuplicationCheck();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = kb.nextInt();
        }
        System.out.println(duplicationCheck.solution(n, array));
    }

    private String solution(int n, int[] array) {
        String answer="U";
        Arrays.sort(array);
        for(int i=0; i<n-1; i++){
            if(array[i]==array[i+1]){
                answer="D";
                break;
            }
        }
        return answer;
    }
}
