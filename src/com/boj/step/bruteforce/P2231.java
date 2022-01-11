package com.boj.step.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        Integer inputOfInteger = Integer.valueOf(input);
        int result = 0;

        for (int i = (inputOfInteger - (inputOfInteger * 9)); i < inputOfInteger; i++) {
            int temp = i;
            int sum = 0;
            while (temp != 0) {
                sum += temp%10;
                temp /= 10;
            }
            if(sum + i == inputOfInteger) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
    }
