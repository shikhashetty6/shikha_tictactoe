package 스택큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class 다리를지나는트럭 {

	public 다리를지나는트럭() {
		
	}
	
	public static void main(String[] args) {
		
Solution solution = new Solution();
		
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
//		int bridge_length = 4;
//		int weight = 2;
//		int[] truck_weights = {1, 1};
		
		System.out.println(solution.solution(bridge_length, weight, truck_weights));
	}
	
	// stack 이용해서 풀어보기
//	static class Solution {
//	    public int solution(int bridge_length, int weight, int[] truck_weights) {
//	    	 Vector<Integer> dariFinish = new Vector<Integer>();
//	    	 int answer = 1; 
//        
//	        Stack<Integer> stack = new Stack<Integer>();
//	        for(int i =truck_weights.length-1; i>= 0; i--) {
//        		stack.add(truck_weights[i]);
//        	}
//	        
//	        while(dariFinish.size()!=truck_weights.length) {
//	        	
//	        
//	        	int dariWeight = 0;
//	        	Vector<Integer> dari = new Vector<Integer>();
//	        	
//	        	  while(dariWeight+stack.peek()<=weight) {
//	        		 
//	        		  dariWeight += stack.peek();
//	        		  dari.add(stack.pop());
//	        		  
//	        		  if(stack.size()==0) {
//	        			  break;
//	        		  }
//	        	  }
//	        	  
//	        	  System.out.println("다리무게"+dariWeight);
//	        	  
//	        	  
//	        	  answer += dari.size();
//	        	  System.out.println("초"+answer);
//	        	  
//	        	  for(int i=0; i<dari.size(); i++) {
//	        		  dariFinish.add(dari.get(i));
//	        	  }
//	        	  
//	        }
//	        
//	        return answer + bridge_length;
//	    }
//	}
	
	// Queue 이용해서 풀어보기
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


