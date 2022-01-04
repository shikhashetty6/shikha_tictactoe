package com.boj.step.basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());

        int dayTimeDistance = Integer.parseInt(stringTokenizer.nextToken());
        int nightDistance = Integer.parseInt(stringTokenizer.nextToken());
        int stickHeight = Integer.parseInt(stringTokenizer.nextToken());

        int day = (stickHeight - nightDistance) / (dayTimeDistance - nightDistance);

        if ((stickHeight - nightDistance) % (dayTimeDistance - nightDistance) != 0) {
            day++;
        }
        System.out.println(day);

    }
}
