package com.lecture.sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = kb.nextInt();
        }
        for (int i : insertionSort.solution(n, array)) {
            System.out.print(i + " ");
        }
    }

    private int[] solution(int n, int[] array) {
        for (int i = 1; i < n; i++) {
            int tmp = array[i], j;
            for (j = i - 1; j >= 0; j--) {
                if(array[j] > tmp)array[j+1] = array[j];
                else break;
            }
            array[j+1]=tmp;
        }
        return array;
    }
}
