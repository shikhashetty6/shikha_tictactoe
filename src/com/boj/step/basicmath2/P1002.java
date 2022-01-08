package com.boj.step.basicmath2;

import java.io.*;
import java.util.StringTokenizer;

public class P1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer count = Integer.parseInt(bf.readLine());
        StringTokenizer stringTokenizer;
        for (int i = 0; i < count; i++) {
            stringTokenizer = new StringTokenizer(bf.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int r1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());
            int r2 = Integer.parseInt(stringTokenizer.nextToken());

            int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            // case 1 : 중점이 같으면서 반지름도 같을 경우
            if(x1 == x2 && y1 == y2 && r1 == r2) bw.write(String.valueOf(-1));
            // case 2-1 : 두 원의 반지름 합보다 중점간 거리가 더 길 때
            else if(distance_pow > Math.pow(r1 + r2, 2)) bw.write(String.valueOf(0));
            // case 2-2 : 원 안에 원이 있으나 내접하지 않을 때
            else if(distance_pow < Math.pow(r2 - r1, 2)) bw.write(String.valueOf(0));
            // case 3-1 : 내접할 때
            else if(distance_pow == Math.pow(r2 - r1, 2)) bw.write(String.valueOf(1));
            // case 3-2 : 외접할 때
            else if(distance_pow == Math.pow(r1 + r2, 2)) bw.write(String.valueOf(1));
            else bw.write(String.valueOf(2));

            bw.newLine();
        }
        bw.flush();
        bw.close();
        bf.close();
    }
}
