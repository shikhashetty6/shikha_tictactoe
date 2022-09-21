package com.test.sk;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
        Test3 test3 = new Test3();
//        int n = 5;
//        String[] plans = {"100 1 3", "500 4", "2000 5"};
//        String[] clients = {"300 3 5", "1500 1", "100 1 3", "50 1 2"};
        int n = 4;
        String[] plans = {"38 2 3", "394 1 4"};
        String[] clients = {"10 2 3", "300 1 2 3 4", "500 1"};

        test3.solution(n, plans, clients);
    }

    public int[] solution(int n, String[] plans, String[] clients) {
        int[] answer = new int[clients.length];
        int[] planData = new int[plans.length];
        ArrayList<ArrayList<Integer>> planService = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            planService.add(new ArrayList<Integer>());
        }

        for (int k = 0; k < plans.length; k++) {
            String plan = plans[k];
            String[] temp = plan.split(" ");
            planData[k] = Integer.parseInt(temp[0]);
            for (int j = 1; j < temp.length; j++) {
                if (k >= 1) {
                    ArrayList<Integer> arrayList = planService.get(k - 1);
                    for (Integer integer : arrayList) {
                        planService.get(k).add(integer);
                    }
                }
                planService.get(k).add(Integer.parseInt(temp[j]));
            }
        }

        int[] clientData = new int[clients.length];
        ArrayList<ArrayList<Integer>> clientService = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            clientService.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < clients.length; i++) {
            String client = clients[i];
            String[] temp = client.split(" ");
            clientData[i] = Integer.parseInt(temp[0]);
            for (int j = 1; j < temp.length; j++) {
                clientService.get(i).add(Integer.parseInt(temp[j]));
            }
        }

        for (int l = 0; l < clients.length; l++) {
            boolean flag = false;
            for (int m = 0; m < plans.length; m++) {
                if(flag) break;
                if((planData[m] >= clientData[l]) && planService.get(m).containsAll(clientService.get(l))){
                    flag = true;
                    answer[l] = m+1;
                }
            }
        }

        return answer;
    }
}
