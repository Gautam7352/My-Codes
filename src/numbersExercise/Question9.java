package numbersExercise;
/*9. Write a Java program to find and print the first 10 happy numbers. 
Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits and
 repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.
Example: 19 is a happy number
1^2 + 9^2=82
8^2 + 2^2=68
6^2 + 8^2=100
1^2 + 0^2 + 02=1

Expected Output

First 10 Happy numbers:                                                 
1                                                                       
7                                                                       
10                                                                      
13                                                                      
19                                                                      
23                                                                      
28                                                                      
31   */
class Question9 {
	
	boolean Happy_Number(int x) {
		boolean bool=false;
		int HN=1;
		while(HN!=1) {
			
			if(HN==x)
				bool= false;
		}
		return bool;
	}
	
	public static void main(String[] args) {
		
	}
}
