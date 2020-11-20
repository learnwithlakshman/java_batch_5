package com.careerit.cj.day13;

public class StudentGrade {

	public static void main(String[] args) {
		int marks[][] = new int[][] 
				{ { 23, 45, 56, 34 },
			      { 45, 23, 67, 78 }, 
			      { 78, 89, 90, 80 }, 
			      { 53, 45, 78, 61 } 
			   };
			   
	    // Find total score of each student
			  
	    for(int i=0;i<marks.length;i++) {
	    	int sum = 0;
	    	for(int j=0;j<marks[i].length;j++) {
	    		sum += marks[i][j];
	    	}
	    	System.out.println("Total score of sutdent :"+(i+1)+" is "+sum);
	    }
	    
	    int max = marks[0][0];
	    
	    for(int i=0;i<marks.length;i++) {
	    	for(int j=0;j<marks[i].length;j++) {
	    		if(max < marks[i][j]) {
	    			max = marks[i][j];
	    		}
	    	}
	    }
	    System.out.println("Max score is           :"+max);
	    
	    
	    // Find each subject max and min scores
	    
	    for(int i=0;i<marks.length;i++) {
	    	int subMax = marks[i][0];
	    	for(int j=0;j<marks[i].length;j++) {
	    		if(subMax < marks[j][i]) {
	    			subMax = marks[j][i];
	    		}
	    	}
	    	System.out.println("Subject :"+(i+1)+" max score is: "+subMax);
	    }
	    
	}
	
	
	
}
