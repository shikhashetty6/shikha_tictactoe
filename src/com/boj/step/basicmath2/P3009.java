package com.boj.step.basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizerX = new StringTokenizer(bf.readLine());
        String x1 = stringTokenizerX.nextToken();
        String x2 = stringTokenizerX.nextToken();

        StringTokenizer stringTokenizerY = new StringTokenizer(bf.readLine());
        String y1 = stringTokenizerY.nextToken();
        String y2 = stringTokenizerY.nextToken();

        StringTokenizer stringTokenizerZ = new StringTokenizer(bf.readLine());
        String z1 = stringTokenizerZ.nextToken();
        String z2 = stringTokenizerZ.nextToken();

        String output1 = null;
        String output2 = null;

        if (x1.equals(y1)) output1 = z1;
        else if(x1.equals(z1)) output1 = y1;
        else if (y1.equals(z1)) output1 = x1;

        if (x2.equals(y2)) output2 = z2;
        else if(x2.equals(z2)) output2 = y2;
        else if (y2.equals(z2)) output2 = x2;

        System.out.println(output1 + " " +output2);

    }
}
