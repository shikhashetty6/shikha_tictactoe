package com.boj.step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = Integer.parseInt(st.nextToken());

        for (int i = 0; i < count; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
            arrayList.add(stringTokenizer.nextToken()); }

        for (int i = 0; i < arrayList.size(); i++) {
            int oCount = 0;
            int result = 0;
            for(int k = 0; k < arrayList.get(i).length(); k++){
                if(arrayList.get(i).substring(k, k+1).equals("O")){
                    oCount++;
                }
                if((oCount > 0 && arrayList.get(i).substring(k, k+1).equals("X"))
                        ||((oCount > 0 && k == arrayList.get(i).length()-1))){
                    int sum = 0;
                    for(int j = 1; j <= oCount; j++){
                        sum += j;
                    }
                    result += sum;
                    oCount = 0;
                }
            }
            System.out.println(result);
        }
    }
}
