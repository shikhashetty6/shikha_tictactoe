package com.lecture.review.R220912;

import com.lecture.review.R0509.PizzaDeliveryDistance0509;

import java.util.Scanner;

public class RecursiveFunction220912 {

    public static void main(String[] args) {
        RecursiveFunction220912 recursiveFunction220912 = new RecursiveFunction220912();
        Scanner kb = new Scanner(System.in);
        Integer n = kb.nextInt();
        recursiveFunction220912.solution(n);
    }

    private void solution(int n) {
        dfs(n);
    }

    private void dfs(int n) {
        if(n==0) return;
        else{
            dfs(n-1);
            System.out.print(n + " ");
        }
    }
}
