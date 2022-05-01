//package com.lecture.dfsbfsapplication;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class PizzaDeliveryStreet {
//    static int n, m, answer;
//    static int[][] board;
//    static ArrayList<Point> pz = new ArrayList<>();
//
//    private void dfs() {
//
//    }
//
//    public static class Point{
//        public int x, y;
//        public Point(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
//
//    public static void main(String[] args) {
//        PizzaDeliveryStreet pizzaDeliveryStreet = new PizzaDeliveryStreet();
//        Scanner kb = new Scanner(System.in);
//        n = kb.nextInt();
//        m = kb.nextInt();
//        board = new int[n+1][n+1];
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                int temp = kb.nextInt();
//                if(temp == 2) pz.add(new Point(i, j));
//                board[i][j] = temp;
//            }
//        }
//        pizzaDeliveryStreet.combination();
//
//        pizzaDeliveryStreet.dfs();
//    }
//
//    private void solution() {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (board[i][j] == 2) {
//                    dfs();
//                }
//            }
//        }
//    }
//
//    private void combination(int L, int s) {
//        if (L == m) {
//
//            for (int i : result) System.out.print(i + " ");
//            System.out.println();
//        }
//        else{
//            for (int i = s; i <= n; i++) {
//                pz.add(i);
//                combination(L+1, i+1);
//            }
//        }
//    }
//
//}
