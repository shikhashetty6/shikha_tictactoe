package com.boj.step.basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer minInput = Integer.parseInt(bf.readLine());
        Integer maxInput = Integer.parseInt(bf.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();

        int sum = 0;
        int minResult = 0;

        for (int i = minInput; i <= maxInput; i++) {
            boolean check = false;
            if (i == 1) {
                check = true;
            } else{
                for (int j = 2; j < i; j++) {
                    if ((i % j) == 0) {
                        check = true;
                    }
                }
            }
            if (check == false) {
                arrayList.add(i);
            }
        }

        if (arrayList.size() == 0) {
            System.out.println(-1);
        } else{
            minResult = arrayList.get(0);
            for (int i = 0; i < arrayList.size(); i++) {
                if (minResult > arrayList.get(i)) {
                    minResult = arrayList.get(i);
                }
                sum += arrayList.get(i);
            }

            System.out.println(sum);
            System.out.println(minResult);
        }
    }
}
