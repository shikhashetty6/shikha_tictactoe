package com.lecture.dfsbfsbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionFunction {

    private static int input;

    public void recur(int value) {

        System.out.print(value + " ");
        if (value == input) System.exit(1);
        recur(++value);
    }
    public static void main(String[] args) throws IOException {
        RecursionFunction recursionFunction = new RecursionFunction();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = Integer.parseInt(br.readLine());
        recursionFunction.recur(1);
    }
}
