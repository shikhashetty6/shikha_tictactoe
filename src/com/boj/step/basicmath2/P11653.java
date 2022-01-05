package com.boj.step.basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bf.readLine());

        ArrayList<Integer> factorList = new ArrayList<>();
        ArrayList<Integer> primeFactorList = new ArrayList<>();

        for (int i = 1; i <= input; i++) {
            if (input % i ==0) {
                factorList.add(i);}}

        for (int i = 0; i < factorList.size(); i++) {
            if (factorList.get(i) != 1) {
                boolean check = false;
                for (int j = 2; j < factorList.get(i); j++) {
                    if ((factorList.get(i) % j) == 0) {
                        check = true;}}
                if (check == false) {
                    primeFactorList.add(factorList.get(i));}}
        }

        int count = -1;
        int result = input;
        while (true) {
            if (count < primeFactorList.size()-1) count++;
            else break;
            while((result % primeFactorList.get(count))==0) {
                result = result/primeFactorList.get(count);
                System.out.println(primeFactorList.get(count));}
        }
    }
}
