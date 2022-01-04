package com.boj.step.basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Integer input = Integer.parseInt(bf.readLine());

        int value = 1;
        int count = 1;

        while (true) {
            if (value >= input) {
                System.out.println(count);
                break; }
            else {
                value = value + (count * 6);
                count++; } }
    }
}
