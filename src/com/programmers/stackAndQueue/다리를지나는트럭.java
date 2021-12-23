package com.programmers.stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {

    public 다리를지나는트럭() {

    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        System.out.println(solution.solution(bridge_length, weight, truck_weights));
    }

    static class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {

            int answer = 0;
            int sum = 0;

            Queue<Integer> q = new LinkedList<Integer>();
            // Queue<Integer> truckQ = new LinkedList<Integer>();

            for(int t : truck_weights) {
                while(true) {
                    if(q.isEmpty()) {
                        q.add(t);
                        sum += t;
                        answer ++;
                        break;
                    } else if(q.size() == bridge_length) {
                        sum -= q.poll();
                    }
                    else { if(sum+t>weight) {
                        answer++;
                        q.add(0);
                    } else {
                        q.add(t);
                        sum+=t;
                        answer++;
                        break;
                    }

                    }
                }
            }
            return answer + bridge_length;
        }
    }


}