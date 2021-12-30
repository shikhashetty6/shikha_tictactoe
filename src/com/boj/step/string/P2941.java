package com.boj.step.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = new StringTokenizer(bf.readLine()).nextToken();
        int resultCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("c")) {
                if(i+2 <= s.length()){ if (s.substring(i + 1, i + 2).equals("=") || s.substring(i + 1, i + 2).equals("-")) i++; } }
            else if(s.substring(i, i + 1).equals("d")) {
                if((i+3 <= s.length())) {
                    if ((s.substring(i + 1, i + 2).equals("z")) && (s.substring(i + 2, i + 3).equals("="))) i = i + 2; }
                if((i+2 <= s.length())){ if (s.substring(i + 1, i + 2).equals("-"))  i++; } }
            else if(s.substring(i, i + 1).equals("l")) {
                if(i+2 <= s.length()) { if (s.substring(i + 1, i + 2).equals("j")) i++; }}
            else if(s.substring(i, i + 1).equals("n")) {
                if(i+2 <= s.length()) if (s.substring(i + 1, i + 2).equals("j"))  i++; }
            else if(s.substring(i, i + 1).equals("s")) {
                if(i+2 <= s.length()) if (s.substring(i + 1, i + 2).equals("=")) i++; }
            else if(s.substring(i, i + 1).equals("z")) {
                if(i+2 <= s.length()) if (s.substring(i + 1, i + 2).equals("=")) i++; }
            resultCount++; }
        System.out.println(resultCount);
    }
}
