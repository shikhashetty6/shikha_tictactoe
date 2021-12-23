package com.programmers.hash;

import java.util.HashMap;

public class 위장 {

	public 위장() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		String[][] clothes= {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution.solution(clothes));
	}
	
	static class Solution {
	    public int solution(String[][] clothes) {
	        int answer = 1;
	        
	         HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
	         
	         for(int i=0; i<clothes.length; i++) {
	        	 hashMap.put(clothes[i][1], hashMap.getOrDefault(clothes[i][1], 0)+1);
	         }
	         
	         for(String key : hashMap.keySet()) {
	        	 answer *= hashMap.get(key)+1;
	         }
	         
	         return answer-1;
	        
	        
	    }
	}

}
