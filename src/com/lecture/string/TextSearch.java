package com.lecture.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextSearch {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input1 = br.readLine();
        char input2 = br.readLine().charAt(0);
        int count = 0;

        for (int i = 0; i < input1.length(); i++) {
            String substring = input1.substring(i, i + 1);
            if ((substring.charAt(0) == input2) || (substring.charAt(0) == input2+32) || (substring.charAt(0) == input2-32)){
                count++;
            }
        }

        System.out.println(count);

    }
}
