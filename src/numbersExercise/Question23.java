package numbersExercise;
/*23. Write a Java program to find all the narcissistic numbers between 1 and 1000. 
In number theory, a narcissistic number is a number that is the sum of its own digits each raised to the power of the number of digits.
For example:
153 = 1^3 + 5^3 + 3^3

Expected Output
1                                                      
2                                                      
3                                                      
4                                                      
5                                                      
6                                                      
7                                                      
8                                                      
9                                                      
153                                                    
370                                                    
371                                                    
407*/
class Question23 {

	public static void main(String[] args) {
		for(int i=0;i<=1000;i++) {
			String s=String.valueOf(i);
			int pow=s.length();
			int sum=0,temp=i;
			while(temp>0) {
				sum=sum+(int)Math.pow(temp%10, pow);
				temp/=10;
			}
			System.out.println(sum);
		}
}
}
