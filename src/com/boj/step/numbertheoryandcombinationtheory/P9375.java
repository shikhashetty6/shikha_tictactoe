package com.boj.step.numbertheoryandcombinationtheory;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P9375 {

    public static void main(String[] args) throws IOException {
        P9375 p9375 = new P9375();
        p9375.solve();
    }

    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> hashMap;

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (count-- > 0) {
            int itemCount = Integer.parseInt(br.readLine());
            hashMap = new HashMap<>();
            int total = 1;
            for(int i=0; i<itemCount; i++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String key = st.nextToken();
                if(hashMap.containsKey(key)){
                    Integer integer = hashMap.get(key);
                    hashMap.put(key, ++integer);
                } else{
                    hashMap.put(key, 1);
                }
            }
            if (hashMap.keySet().size() == 1) {
                bw.write(String.valueOf(itemCount));
            } else{
                for (String s : hashMap.keySet()) {
                    total *= (hashMap.get(s)+1);
                }
                bw.write(String.valueOf(total-1));
            }

            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
