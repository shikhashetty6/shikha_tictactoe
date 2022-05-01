package com.lecture.review;

import java.util.Scanner;

public class Factorial0421 {


    public static void main(String[] args) {
        Factorial0421 factorial0421 = new Factorial0421();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(factorial0421.dfs(n));
    }

    private int dfs(int input) {
        if(input==1) return 1;
        else{
            return input * dfs(input-1);
        }

    }
}
