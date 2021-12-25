package com.boj.step.whileoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
        String initialInput = stringTokenizer.nextToken();
        String result = initialInput;
        int count = 0;

        do {
            count++;
            int tempResult;
            if (String.valueOf(result).length() == 1)
                result = "0"+result;

            tempResult = Integer.parseInt(result.substring(0, 1)) + Integer.parseInt(result.substring(1, 2));
            if (String.valueOf(tempResult).length() == 2) {
                if(result.substring(1, 2).equals("0"))
                    result = String.valueOf(tempResult).substring(1, 2);
                else result = result.substring(1, 2).concat(String.valueOf(tempResult).substring(1, 2)); }
            else if (String.valueOf(tempResult).length() == 1) {
                if(result.substring(1, 2).equals("0")) {
                    result = String.valueOf(tempResult).substring(0, 1); }
                else result = result.substring(1, 2).concat(String.valueOf(tempResult).substring(0, 1)); } }
        while (!initialInput.equals(result));
        System.out.println(count);
    }
}
