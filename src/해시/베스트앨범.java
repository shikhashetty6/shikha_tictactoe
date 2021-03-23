package 해시;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.Vector;

public class 베스트앨범 {

	public 베스트앨범() {
			}
	
	public static void main(String args[]) {
		
		int[] answer = {};
		
		String[] genres = {"classic", "pop", "classic", "classic", "pop", "classic"};
		int[] plays = {500, 600, 150, 800, 2500, 800};
		
		ArrayList<String> genresArrayList = new ArrayList<String>();
		ArrayList<Integer> playsArrayList = new ArrayList<Integer>();
		
		ArrayList<Integer> answerArrayList = new ArrayList<Integer>();
		
		for(int i=0; i<genres.length; i++) {
			genresArrayList.add(genres[i]);
		}
		
		for(int i=0; i<plays.length; i++) {
			playsArrayList.add(plays[i]);
		}
		
		
		 HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		 
		  for(int i=0; i<genres.length; i++){
              hashMap.put(genres[i], hashMap.getOrDefault(genres[i], 0)+plays[i]);
        }
		  
		  Set<String> genresSet = hashMap.keySet();
		  
		  HashMap<String, Integer> genresRankMap = new HashMap<String, Integer>();
		  
		  Vector<String> temp = new Vector<String>();
		  
		  for(String key : genresSet) {
			  temp.add(key);
		  }
		  
		  String temp1 ="";
		  
	        for(int i=0; i<temp.size()-1; i++){
          for(int j=i+1; j<temp.size(); j++){
                if(hashMap.get(temp.get(i))<hashMap.get(temp.get(j))) {
                	temp1 = temp.get(j);
                	temp.set(j, temp.get(i));
                	temp.set(i, temp1); 
 
                }
                	
          }
      }
	        for(int i=0; i<temp.size(); i++){
	        	
	        	int max1 = 0;
	        	int max2 = 0;
	        	
	        	for(int j=0; j<genres.length; j++) {
	        		if(genres[j].equals(temp.get(i))) {
	        			if(max1<=plays[j]) {
	        				if(max1>max2){
	        					max2 = max1;
	        				}
	        				max1 = plays[j];
	        			}
	        			else if(max2<=plays[j]) {
	        				max2 = plays[j];
	        			}
	        			
	        		}
	        	}
	        	
	        	if(max1!=0) {
	        		answerArrayList.add(playsArrayList.indexOf(max1));
	        		
	        	}
	        	if(max2!=0) {
	        		if(max2==max1) {
	        			answerArrayList.add(playsArrayList.lastIndexOf(max2));
	        		}else {
	        			answerArrayList.add(playsArrayList.indexOf(max2));
	        		}
	        		
	        	}
	        
	        
	        }
	        
	        System.out.println(playsArrayList);
	        
	        answer = new int[answerArrayList.size()];
	       
	        for(int i=0; i<answerArrayList.size(); i++) {
	        	answer[i] = answerArrayList.get(i);
	        }

	        System.out.println(answerArrayList);

	}
	
}
	
