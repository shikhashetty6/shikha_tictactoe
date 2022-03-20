package com.lecture.dfsbfsbasic;

public class FactorialSolution {

    private int dfs(int n) {
        if(n==1) return 1;
        else return n * dfs(n-1);
    }

    public static void main(String[] args) {
        FactorialSolution factorialSolution = new FactorialSolution();
        System.out.println(factorialSolution.dfs(5));
    }
}
