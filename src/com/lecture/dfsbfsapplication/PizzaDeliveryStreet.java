package com.lecture.dfsbfsapplication;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaDeliveryStreet {
    static int n, m, len, answer=Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> hs, pz;

    public static void main(String[] args) {
        PizzaDeliveryStreet pizzaDeliveryStreet = new PizzaDeliveryStreet();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = kb.nextInt();
                if(tmp == 1) hs.add(new Point(i,j));
                else if(tmp ==2) pz.add(new Point(i,j));
            }
        }
        len = pz.size();
        combi = new int[m];
        pizzaDeliveryStreet.dfs(0, 0);
        System.out.println(answer);
    }

    private void dfs(int L, int s) {
        if (L == m) {
            int sum=0;
            for (Point h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x-pz.get(i).x)+Math.abs(h.y-pz.get(i).y));
                }
                sum+=dis;
            }
            answer = Math.min(sum, answer);
        } else{
            for (int i = s; i < len; i++) {
                combi[L] = i;
                dfs(L+1, i+1);
            }
        }
    }

    static class Point{
        public int x;
        public int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
