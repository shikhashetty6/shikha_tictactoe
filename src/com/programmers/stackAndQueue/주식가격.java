package com.programmers.stackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class 주식가격 {

	public 주식가격() {
		
	}

public static void main(String[] args) {
		
		Solution solution = new Solution();
		int[] prices = {1, 2, 3, 2, 3};
		
		System.out.println(solution.solution(prices));
	}
	
	static class Solution {
//	public int[] solution(int[] prices) {
//		int[] answer = new int[prices.length];
//		
//		for(int i=0; i<prices.length; i++) {
//			for(int j=i+1; j<prices.length; j++) {
//				answer[i]++;
//				if(prices[i]>prices[j])
//					break;
//				
//			}
//		}
//		
//		for(int i=0; i<prices.length; i++) {
//			
//			System.out.println(answer[i]);
//		}
//		
//        return answer;
//	        
//	}
		
		public int[] solution(int[] prices) {
	        int[] answer = new int[prices.length];
	        
	        for(int i=0; i<prices.length; i++) {
	        	int count=0;
	        	int val = prices[i];
	        	Stack<Integer> stack = new Stack<Integer>();
	        	for(int j =prices.length-1; j>= i+1; j--) {
	        		stack.add(prices[j]);
	        	}
	        	int size = stack.size();
	        	for(int j =0; j< size; j++) {
	        		count++;
	        		if(val > stack.pop()) {
	        			break;
	        		}
	        	}
	        	answer[i]=count;
	        }
	        
	        for(int j =0; j< prices.length; j++) {
        		System.out.println(answer[j]);
        	}
	        
	        return answer;
	    }
	
	
	}
}
