package com.boj.step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = new StringTokenizer(bf.readLine()).nextToken();

        // 97~122 a~z
        for (int i = 97; i <= 122; i++) {
            boolean check = false;
            for (int j = 0; j < s.length(); j++) {
                if ((int)s.substring(j, j + 1).charAt(0) == i) {
                    System.out.print(j + " ");
                    check = true;
                    break; } }
            if(check == false){
                System.out.print(-1 + " "); }
        }
    }
}
