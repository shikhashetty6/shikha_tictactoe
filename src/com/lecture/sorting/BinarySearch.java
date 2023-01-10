package com.lecture.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            array[i] = kb.nextInt();
        }
        System.out.println(binarySearch.solution(n, m, array));
    }

    private int solution(int n, int m, int[] array) {
        int answer = 0;
        int lt = 0, rt = n - 1;
        Arrays.sort(array);
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(array[mid]==m){
                answer = mid +1;
                break;
            }
            if(array[mid]>m) rt = mid - 1;
            else lt = mid + 1;
        }
        return answer;
    }
}
