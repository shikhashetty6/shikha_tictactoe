package com.lecture.dfsbfsbasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubSetting {

    public static int input;
    public static int[] ch;

    public void dfs(int L) {
        if (L == input + 1) {
            String tmp = "";
            for (int i = 1; i <= input; i++) {
                if(ch[i]==1) tmp += (i+" ");}
            if (tmp.length() > 0) System.out.println(tmp);
        }
        else{
            ch[L]=1;
            dfs(L+1);
            ch[L]=0;
            dfs(L+1);
        }
    }

    public static void main(String[] args) throws IOException {
        SubSetting subSetting = new SubSetting();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = Integer.parseInt(br.readLine());
        ch = new int[input+1];
        subSetting.dfs(1);
    }
}

