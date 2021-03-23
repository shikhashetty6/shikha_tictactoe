package 정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class K번째수 {

	public K번째수() {	
	}
	
	public static void main(String args[]) {
		
		Solution solution = new Solution();
		int[] array= {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};	
		System.out.println(solution.solution(array, commands));
	}
	
//	static class Solution {
//	    public int[] solution(int[] array, int[][] commands) {
//	        int[] answer = new int[commands.length];
//	        
//	        for(int i=0; i<commands.length; i++) {
//	        	int tempStart = 0;
//	        	int tempFinish = 0;
//	        	tempStart = commands[i][0]-1;
//	        	tempFinish = commands[i][1]-1;
//	        	
//	        	ArrayList<Integer> tempArray = new ArrayList<Integer>();
//	        	for(int j=tempStart; j<=tempFinish; j++) {
//	        		tempArray.add(array[j]);
//	        	}
//	        	Collections.sort(tempArray);
//	        	
//	        	answer[i] = tempArray.get(commands[i][2]-1);
//
//	        }
//	        
//	       
//	        return answer;
//	    }
//	}
	
	static class Solution { // copyOfRange 사용
	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        
	        for(int i=0; i<commands.length; i++) {
	        	
	        		 int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
	                 Arrays.sort(temp);
	                 answer[i] = temp[commands[i][2]-1];
	        	}
	        	       
	        return answer;
	    }
	}

}
