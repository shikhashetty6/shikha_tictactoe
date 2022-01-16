package com.boj.step.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        StringTokenizer stringTokenizer;

        ArrayList<Pair> pointArrayList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            stringTokenizer = new StringTokenizer(bf.readLine());
            pointArrayList.add(new Pair(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken())));
        }

        Collections.sort(pointArrayList, new Comparator<>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.getY() > o2.getY()) return 1;
                else if (o1.getY().equals(o2.getY())) {
                    if (o1.getX() > o2.getX()) return 1;}
                return -1;}
        });

        for (Pair pair : pointArrayList) {
            System.out.println(pair.getX() + " " + pair.getY());
        }
    }

    static class Pair{
        Integer x,y;
        Pair(Integer x, Integer y) {
            this.x=x;
            this.y=y;}

        public Integer getX() {return x;}
        public Integer getY() {return y;}
    }
}
