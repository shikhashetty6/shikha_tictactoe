package com.programmers.hash;

import java.util.Arrays;

public class 전화번호목록 {

	public 전화번호목록() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] phone_book= {"119", "97674223", "1195524421"};
		System.out.println(solution.solution(phone_book));

	}
	
//	public static class Solution {
//	    public boolean solution(String[] phone_book) {
//	        boolean answer = true; 
//	        
//	        for(int i=0; i<phone_book.length; i++){
//	           for(int j=0; j<phone_book.length; j++){
//	               
//	               if(i==j) continue;
//	               if(phone_book[i].length()<=phone_book[j].length()){
//	               if(phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))){
//	                   answer=false;
//	                   break;
//	                   }
//	               }
//	               else{
//	                   break;
//	               }
//	               
//	           }
//	           }
//	        return answer;
//	    }
//	}
	
//	public static class Solution {
//	    public boolean solution(String[] phone_book) {
//	    	boolean answer = true;
//	    	
//	    	for(int i=0; i<phone_book.length-1; i++) {
//	    		for(int j=i+1; j<phone_book.length; j++) {
//	    			if(phone_book[i].startsWith(phone_book[j])) {
//	    				answer = false;
//	    			}
//	    			if(phone_book[j].startsWith(phone_book[i])) {
//	    				answer = false;
//	    			}
//	    			
//	    		}
//	          }
//	    	return answer;
//	    }
//	    
//	}
	
	public static class Solution {
    public boolean solution(String[] phone_book) {
    	boolean answer = true;
    	
    	Arrays.sort(phone_book);
    	
    	 for (int i=0; i<phone_book.length-1; i++) {
             if (phone_book[i+1].startsWith(phone_book[i])) {
            	 answer = false;
                 break;
             }
         }
    	
    	return answer;
    }
    
}

}
