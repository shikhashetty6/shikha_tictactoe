package com.programmers.hash;

import java.util.HashMap;

public class 완주하지못한선수 {
	

	public 완주하지못한선수() {
	}
	
	public static void main(String args[]) {
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		Solution solution = new Solution();
		solution.solution(participant, completion);
		
	}
	
	public static class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        HashMap<String, Integer> hm = new HashMap<>();
	        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
	        for (String player : completion) hm.put(player, hm.get(player) - 1);
	        

	        for (String key : hm.keySet()) {
	            if (hm.get(key) != 0){
	                answer = key;
	            }
	        }
	        return answer;
	    }
	}
	

}
