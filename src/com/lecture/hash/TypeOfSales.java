package com.lecture.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TypeOfSales {
    public static void main(String[] args) {
        TypeOfSales typeOfSales = new TypeOfSales();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = kb.nextInt();
        }
        for(int x : typeOfSales.solution(n, k, array)){
            System.out.print(x + " ");
        }
    }

    private ArrayList<Integer> solution(int n, int k, int[] array) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<k-1; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0)+1);
        }
        for(int i=k-1; i<n; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
            answer.add(map.size());
            map.put(array[i - k + 1], map.get(array[i - k + 1]) - 1);
            if(map.get(array[i-k+1])==0) map.remove(array[i-k+1]);
        }

        return answer;
    }
}
