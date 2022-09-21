package com.test;

public class Test3 {

    private static double mixTime = Double.MAX_VALUE;
    private static int[] pm;

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        int fuel = 8;
        int powers[] = {20,30};
        int distances[] = {750, 675};
        test3.solution(fuel, powers, distances);
    }

    private void solution(int fuel, int[] powers, int[] distances) {
        pm = new int[powers.length];
        dfs(0, fuel, powers, distances);

    }

    private void dfs(int L, int fuel, int[] powers, int[] distances) {
        if (L == powers.length) {
            int sum = 0;
            for (int x : pm){
                sum += x;
            }
            if (sum == fuel) {
                calculate(pm, powers, distances);
                for (int x : pm){
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
        else{
            for (int i = 1; i <= fuel; i++) {
                pm[L] = i;
                dfs(L+1, fuel, powers, distances);
            }
        }
    }

    private void calculate(int[] pm, int[] powers, int[] distances) {
        double sum = 0;
        for (int i = 0; i < 2; i++) {
            double temp1 = ((powers[i] * pm[i]) * pm[i]) / 2;
            double temp2 = distances[i] - temp1;
            double time1 = pm[i];
            double time2 = temp2 / (double)((powers[i] * pm[i]));
//            System.out.println("time1"+time1);
//            System.out.println("time2"+time2);
            sum = time1 + time2;
        }
        mixTime = Math.min(mixTime, sum);
        System.out.println(mixTime);
    }


}
