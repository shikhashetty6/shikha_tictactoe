package com.boj.step.inputoutputncalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2588 {

    BufferedReader bf;
    String a, b;
    Integer b1, b2, b3;

    public P2588() {
        this.bf = new BufferedReader(new InputStreamReader(System.in)); }

    private void readInput() throws IOException {
        StringTokenizer stringTokenizer = new StringTokenizer(this.bf.readLine());
        this.a = stringTokenizer.nextToken();

        StringTokenizer stringTokenizer2 = new StringTokenizer(this.bf.readLine());
        this.b = stringTokenizer2.nextToken();
        this.b1 = Integer.valueOf(this.b.substring(0, 1));
        this.b2 = Integer.valueOf(this.b.substring(1, 2));
        this.b3 = Integer.valueOf(this.b.substring(2, 3));
    }

    private void writeOutput() {
        fourthResult(firstResult(), secondResult(), thirdResult());
    }

    private int firstResult() {
        int firstResult = Integer.valueOf(this.a) * this.b3;
        System.out.println(firstResult);
        return firstResult;
    }
    private int secondResult() {
        int secondResult = Integer.valueOf(this.a) * this.b2;
        System.out.println(secondResult);
        return secondResult;
    }
    private int thirdResult() {
        int thirdResult = Integer.valueOf(this.a) * this.b1;
        System.out.println(thirdResult);
        return thirdResult;
    }

    private void fourthResult(int firstResult, int secondResult, int thirdResult) {
        System.out.println((thirdResult*100)+(secondResult*10)+(firstResult));
    }

    public static void main(String[] args) throws IOException {
        P2588 p2588 = new P2588();
        p2588.readInput();
        p2588.writeOutput();
    }

}
