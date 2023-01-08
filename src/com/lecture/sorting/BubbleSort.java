package com.lecture.sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = kb.nextInt();
        }
        for (int i : bubbleSort.solution(n, array)) {
            System.out.print(i + " ");
        }
    }

    private int[] solution(int n, int[] array) {
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        return array;
    }
}
