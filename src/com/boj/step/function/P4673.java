package com.boj.step.function;

import java.io.IOException;

public class P4673 {

    public static void main(String[] args) throws IOException {

        boolean[] check = new boolean[10001];
        P4673 p4673 = new P4673();
        for(int i=1; i<=10000; i++){
            if(p4673.d(i)<=10000){
                check[p4673.d(i)] = true;
            };
        }

        for(int i=1; i<=10000; i++){
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }

    public int d(int num){
        int sum = num;
        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
}
