package com.boj.step.basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());

        Long fixedCost = Long.parseLong(stringTokenizer.nextToken());
        Long variableCost = Long.parseLong(stringTokenizer.nextToken());
        Long laptopPrice = Long.parseLong(stringTokenizer.nextToken());

        if(variableCost>=laptopPrice){
            System.out.println(-1);
        } else {
            System.out.println((fixedCost / (laptopPrice - variableCost))+1);
        }
    }
}
