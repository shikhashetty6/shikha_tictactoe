package com.lecture.array;

import java.util.Scanner;

public class MentoringSolution {
    public static void main(String[] args) {
        MentoringSolution mentoring = new MentoringSolution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = kb.nextInt();
            }
        }
        System.out.println(mentoring.solution(n, m, array));

    }

    private int solution(int n, int m, int[][] array) {
        int answer = 0;
        // 처음 이중 포문은 경우의 수를 세는 것
        // 1(멘토) -1(멘티) 물론, 1-1멘토멘티가 될 일은 없음, 즉 효율적으로 짜진 않은 것
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if(array[k][s]==i) pi = s;
                        if(array[k][s]==j) pj = s;
                    }
                    if(pi<pj) cnt++;
                }
                if (cnt == m) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
