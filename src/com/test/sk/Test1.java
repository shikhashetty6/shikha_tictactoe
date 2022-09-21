package com.test.sk;

public class Test1 {

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        int p[] = {1,2,3,4,5,6,7,8,9};
        test1.solution(p);
    }

    private int[] solution(int[] p) {
        int[] answer = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            int minValue = Integer.MAX_VALUE;
            int minIndex = 0;
        for (int j = i; j < p.length; j++) {
            if (p[j] < minValue) {
                minValue = p[j];
                minIndex = j;
            }
        }
            if (i != minIndex) {
                int temp = p[i];
                p[i] = p[minIndex];
                p[minIndex] = temp;
                answer[i] = answer[i]+1;
                answer[minIndex] = answer[minIndex]+1;
            }
        }
        return answer;
    }
}
