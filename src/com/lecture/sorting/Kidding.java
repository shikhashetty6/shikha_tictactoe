package com.lecture.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kidding {
    public static void main(String[] args) {
        Kidding kidding = new Kidding();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = kb.nextInt();
        }
        for (int value : kidding.solution(n, array)) {
            System.out.print(value+" ");
        }
    }

    private ArrayList<Integer> solution(int n, int[] array) {
        ArrayList<Integer> answer=new ArrayList<>();
        int[] tmp=array.clone();
        Arrays.sort(tmp);
        for(int i=0; i<n; i++){
            if(array[i]!=tmp[i]) answer.add(i+1);
        }
        return answer;
    }
}
