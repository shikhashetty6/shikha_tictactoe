package com.lecture.review.R0509;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaDeliveryDistance0509 {

    static int n, m, answer = Integer.MAX_VALUE;
    static ArrayList<Point> house = new ArrayList<>(), pizza = new ArrayList<>();
    static Point[] pizzaCombi;

    private void dfs(int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Point point : house) {
                int temp = Integer.MAX_VALUE;
                for (int i = 0; i < m; i++) {
                    temp = Math.min(temp, Math.abs(point.x-pizzaCombi[i].x) + Math.abs(point.y-pizzaCombi[i].y));
                }
                sum += temp;
            }
            answer = Math.min(sum, answer);
        } else{
            for (int i = s; i < pizza.size(); i++) {
                    pizzaCombi[L] = pizza.get(i);
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

    public static void main(String[] args) {
        PizzaDeliveryDistance0509 pizzaDeliveryDistance0508 = new PizzaDeliveryDistance0509();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = kb.nextInt();
                if(value==1) house.add(new Point(i, j));
                else if(value==2) pizza.add(new Point(i, j));
            }
        }
        pizzaCombi = new Point[m];

        pizzaDeliveryDistance0508.dfs(0, 0);
        System.out.println(answer);
    }

}
