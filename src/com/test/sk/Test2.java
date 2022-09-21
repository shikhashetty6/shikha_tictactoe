package com.test.sk;

public class Test2 {

    public static void main(String[] args) {
        Test2 test2 = new Test2();
//        int[] periods = {20,23,24};
//        int[][] payments = {{100000, 100000, 100000,
//                100000, 100000, 100000,
//                100000, 100000, 100000,
//                100000, 100000, 100000,
//                100000, 100000, 100000},
//                {100000, 100000, 100000,
//                        100000, 100000, 100000,
//                        100000, 100000, 100000,
//                        100000, 100000, 100000,
//                        100000, 100000, 100000},
//                {350000, 50000, 50000,
//                50000, 50000, 50000,
//                        50000, 50000, 50000,
//                        50000, 50000, 50000}};
//        int[] estimates = {100000, 100000, 100000};
        int[] periods = {24,59,59, 60};
        int[][] payments = {{50000, 50000, 50000,
                50000, 50000, 50000,
                50000, 50000, 50000,
                50000, 50000, 50000},
                {50000, 50000, 50000,
                        50000, 50000, 50000,
                        50000, 50000, 50000,
                        50000, 50000, 50000},
                {350000, 50000, 50000,
                        50000, 50000, 50000,
                        50000, 50000, 50000,
                        50000, 50000, 50000},
                {50000, 50000, 50000,
                        50000, 50000, 50000,
                        50000, 50000, 50000,
                        50000, 50000, 50000}};
        int[] estimates = {350000, 50000, 40000, 50000};
        test2.solution(periods, payments, estimates);
    }

    private int[] solution(int[] periods, int[][] payments, int[] estimates) {
        int[] answer = new int[2];
        for (int i = 0; i < periods.length; i++) {
            int thisMonthPayments = currentThisMonthPayments(i, payments);
            int nextMonthPayments = currentNextMonthPayments(i, payments, estimates);
            boolean thisMonthVIP = checkVIP(thisMonthPayments, periods[i]);
            boolean nextMonthVIP = checkVIP(nextMonthPayments, periods[i]+1);
            if ((!thisMonthVIP) && (nextMonthVIP)) {
                answer[0] = answer[0] + 1;
            }
            else if ((thisMonthVIP) && (!nextMonthVIP)) {
                answer[1] = answer[1] + 1;
            }
        }
        for (int k = 0; k < 2; k++) {
            System.out.println(answer[k]);
        }
        return answer;
    }

    private boolean checkVIP(int thisMonthPayments, int period) {
        if ((period >= 24 && thisMonthPayments >= 900000) || (period >= 60 && thisMonthPayments>=600000 && thisMonthPayments<900000)) {
            return true;
        }
        return false;
    }

    private int currentThisMonthPayments(int i, int[][] payments) {
        int sum = 0;
        for (int j = 0; j < 12; j++) {
            sum += payments[i][j];
        }
        return sum;
    }

    private int currentNextMonthPayments(int i, int[][] payments, int[] estimates) {
        int sum = 0;
        for (int j = 1; j < 12; j++) {
            sum += payments[i][j];
        }
        sum += estimates[i];
        return sum;
    }
}
