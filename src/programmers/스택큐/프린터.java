package 스택큐;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class 프린터 {

	public 프린터() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Solution solution = new Solution();
				
//				int location = 2;
//				int[] priorities = {2,1,3,2};
				
				int location = 0;
				int[] priorities = {1,1,9,1,1,1};
				
				
				System.out.println("최종답"+solution.solution(priorities, location));
			}
	
	static class Solution {
	    public int solution(int[] priorities, int location) {
	    	  int answer = 0;
	    	  int priority = 0;
	 	     
		        Queue<Integer> q = new LinkedList<Integer>();
		        Vector<Integer> tempPriorities = new Vector<Integer>(); 
		        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		        
		        for(int i=0; i<priorities.length; i++) {
		        	tempPriorities.add(priorities[i]);
		        	//q.add(priorities[i]);
		        	
		        	 hashMap.put(i, priorities[i]);
		        	 q.add(i);
		        	
		        }

		        
		        System.out.println("q확인"+q);
		        
		        while(true) {
		        
		        	priority = 0;
		        	System.out.println("사이즈확인"+tempPriorities.size());
		        	   for(int i=0; i<tempPriorities.size(); i++) {
		        		   priority = (priority < tempPriorities.get(i) ? tempPriorities.get(i) : priority);
		        	   }
		        	   System.out.println("우선순위"+priority);
		        	if(hashMap.get(q.peek())<priority) {
		        		q.add(q.poll());
		        		System.out.println("q확인"+q);
		        	}
		        	else if(location==q.peek()) {
		        		System.out.println("q확인"+q);
		        		q.poll();
		        			answer = priorities.length-q.size();
		        			break;
		        		}
		        	else {
		        		System.out.println("인덱스확인"+q.peek());
		        		System.out.println("지운것"+tempPriorities.remove(tempPriorities.indexOf(hashMap.get(q.poll()))));
		        	}
		        		
		        }

	        return answer;
	    }
	}

}
