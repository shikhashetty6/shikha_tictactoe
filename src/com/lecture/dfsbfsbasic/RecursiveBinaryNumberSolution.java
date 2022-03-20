package com.lecture.dfsbfsbasic;

public class RecursiveBinaryNumberSolution {

    public void dfs(int n){
        if(n==0) return;
        else{
            dfs(n/2);
            System.out.println(n%2);
        }
    }

    public static void main(String[] args) {
        RecursiveBinaryNumber recursiveBinaryNumber = new RecursiveBinaryNumber();
        recursiveBinaryNumber.dfs(11);
    }
}
