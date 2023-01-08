package com.lecture.sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = kb.nextInt();
        }
        for (int i : selectionSort.solution(n, array)) {
            System.out.print(i + " ");
        }
    }

    private int[] solution(int n, int[] array) {
        for(int i=0; i<n-1; i++){
            int idx = i;
            for(int j=i+1; j<n; j++){
                if(array[j]<array[idx]) idx = j;
            }
            int tmp = array[i];
            array[i] = array[idx];
            array[idx] = tmp;
        }
        return array;
    }
}
