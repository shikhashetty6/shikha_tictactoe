package com.boj.step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = new StringTokenizer(bf.readLine()).nextToken();
        HashMap<Integer, Integer> hashMap;
        Integer count = Integer.valueOf(s);

        for (int i = 0; i < Integer.valueOf(s); i++) {
            String str = bf.readLine();
            Integer prev = 0;
            hashMap = new HashMap<>();
            for (int n = 0; n < 26; n++) {
                hashMap.put(n+97, 0);
            }

            for (int j = 0; j < str.length(); j++) {
                Integer a = Integer.valueOf(str.substring(j, j + 1).charAt(0));
                if(prev != a){
                    if (hashMap.get(a) == 0) {
                        hashMap.put(a, 1);
                        prev = a; }
                    else if (hashMap.get(a) == 1) {
                        count--;
                        break; } }
            }
        }
        System.out.println(count);
    }
}
