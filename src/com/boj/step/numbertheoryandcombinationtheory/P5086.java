package com.boj.step.numbertheoryandcombinationtheory;

import java.io.*;
import java.util.StringTokenizer;

public class P5086 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int input1 = Integer.parseInt(st.nextToken());
            int input2 = Integer.parseInt(st.nextToken());

            if (input1 == 0 && input2 == 0) break;
            else if (input2 % input1 == 0) bw.write("factor");
            else if(input1 % input2 == 0) bw.write("multiple");
            else bw.write("neither");

            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
