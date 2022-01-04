package com.boj.step.basicmath1;

import java.io.*;
import java.util.StringTokenizer;

public class P10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer calculationCount = Integer.parseInt(bf.readLine());

        for (int i = 0; i < calculationCount; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
            Integer height = Integer.parseInt(stringTokenizer.nextToken());
            Integer.parseInt(stringTokenizer.nextToken());
            Integer numberOfCustomer = Integer.parseInt(stringTokenizer.nextToken());

            Integer roomHeight;
            Integer roomNumber;
            Integer result;

            if ((numberOfCustomer % height) == 0) {
                roomHeight = 100 * height;
                roomNumber = (numberOfCustomer / height);
            } else{
                roomHeight = 100 * (numberOfCustomer % height);
                roomNumber = (numberOfCustomer / height) + 1;
            }
            result = roomHeight+roomNumber;
            bw.write(String.valueOf(result));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        bf.close();
        }
}