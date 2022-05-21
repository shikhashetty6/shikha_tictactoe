package com.lecture.array;

import java.util.Scanner;

public class RockPaperScissorsSolution {
    public static void main(String[] args) {
        RockPaperScissorsSolution rockPaperScissorsSolution = new RockPaperScissorsSolution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = kb.nextInt();
        }
        for (char x : rockPaperScissorsSolution.solution(n, a, b).toCharArray()) System.out.println(x);

    }
    private String solution(int n, int[] a, int[] b) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) answer += "D";
            else if (a[i]==1 && b[i]==3) answer += "A";
            else if (a[i]==2 && b[i]==1) answer += "A";
            else if (a[i]==3 && b[i]==2) answer += "A";
            else answer += "B";
        }
        return answer;
    }
}
