package com.programmers.stackAndQueue;

import java.util.ArrayList;
import java.util.Stack;


public class 기능개발 {

	public 기능개발() {
	}
	
public static void main(String[] args) {
		
		Solution solution = new Solution();
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
//		int[] progresses = {95, 90, 99, 99, 80, 99};
//		int[] speeds = {1, 1, 1, 1, 1, 1};
		
//		int[] progresses = {20, 90, 90};
//		int[] speeds = {1, 1, 20};
		
		System.out.println(solution.solution(progresses, speeds));
	}
	
 static class Solution {

	  public int[] solution(int[] progresses, int[] speeds) {
		  
		  Stack<Integer> stack = new Stack<Integer>();
		  
		  for(int i= progresses.length-1; i>= 0 ; i--) {
			  stack.add((100-progresses[i])/speeds[i] + ((100-progresses[i])%speeds[i]>0 ? 1 : 0 ));
		  }
		  
		  System.out.println(stack);
		  
		  ArrayList<Integer> s = new ArrayList<Integer>();
		  
		  while(!stack.isEmpty()) {
			  int count = 1;
			  
			  int top = stack.pop();
			  
			  while(!stack.isEmpty() && stack.peek() <= top) {
				  count ++;
				  stack.pop();
			  }
			  
			  s.add(count);
			  
		  }
		  
		  int[] answer = new int[s.size()];

			for (int i = 0; i < answer.length; i++) {
				answer[i] = s.get(i);
				System.out.println(answer[i]);
			}

			return answer;
		  
	  }
    
}

}
