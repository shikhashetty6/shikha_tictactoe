package com.boj.step.basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Double r = Double.parseDouble(bf.readLine());

        String euclideanGeometryValue = String.format("%.6f", r * r * Math.PI);
        String taxiGeometryValue = String.format("%.6f", Math.pow(r, 2) + Math.pow(r, 2));
        System.out.println(euclideanGeometryValue);
        System.out.println(taxiGeometryValue);

    }
}
