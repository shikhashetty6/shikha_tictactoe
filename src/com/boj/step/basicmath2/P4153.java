package com.boj.step.basicmath2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer a, b, c;
        StringTokenizer stringTokenizer;
        ArrayList<Integer> arrayList;

        while (true) {
            stringTokenizer = new StringTokenizer(bf.readLine());
            arrayList = new ArrayList<>();
            if((a = Integer.parseInt(stringTokenizer.nextToken()))==0) break;
            else {
                b = Integer.parseInt(stringTokenizer.nextToken());
                c = Integer.parseInt(stringTokenizer.nextToken());
                arrayList.add(a);
                arrayList.add(b);
                arrayList.add(c);
                Collections.sort(arrayList);
                if(Math.pow(arrayList.get(0), 2)+Math.pow(arrayList.get(1), 2)==Math.pow(arrayList.get(2), 2)) bw.write("right");
                else bw.write("wrong");
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        bf.close();
    }
}
