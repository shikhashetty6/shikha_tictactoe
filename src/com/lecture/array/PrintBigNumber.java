package com.lecture.array;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintBigNumber {
    public static void main(String[] args) {
        PrintBigNumber printBigNumber = new PrintBigNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = kb.nextInt();
        }
        for (int i : printBigNumber.solution(n, array)) {
            System.out.print(i+" ");
        }
    }

    private ArrayList<Integer> solution(int n, int[] array) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(array[0]);
        for (int i = 1; i < n; i++) {
            if (array[i] > array[i - 1]) {
                answer.add(array[i]);
            }
        }
        return answer;
    }
}
