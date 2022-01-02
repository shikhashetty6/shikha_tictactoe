package com.boj.step.basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer input = Integer.parseInt(bf.readLine());

        int prevCrossCount = 0;
        int crossCount = 1;

        while (true) {
            if(input <= prevCrossCount + crossCount){
                if (crossCount % 2 == 1) {
                    System.out.println((crossCount-(input-prevCrossCount-1))+"/"+(input-prevCrossCount));
                    break;
                } else {
                    System.out.println((input-prevCrossCount)+"/"+(crossCount-(input-prevCrossCount-1)));
                    break;
                }
            }
            else{
                prevCrossCount += crossCount;
                crossCount++;
            }
        }
    }
}
