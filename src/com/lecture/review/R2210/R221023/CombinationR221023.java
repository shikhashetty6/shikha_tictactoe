package com.lecture.review.R2210.R221023;

import java.util.Scanner;

class CombinationR221023{
    static int[] combi;
    static int n, m;
    public void DFS(int L, int s){
        if(L==m){
            for(int x : combi) System.out.print(x+" ");
            System.out.println();
        }
        else{
            for(int i=s; i<=n; i++){
                combi[L]=i;
                DFS(L+1, i+1);
            }
        }
    }
    public static void main(String[] args){
        CombinationR221023 T = new CombinationR221023();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        combi=new int[m];
        T.DFS(0, 1);
    }
}
