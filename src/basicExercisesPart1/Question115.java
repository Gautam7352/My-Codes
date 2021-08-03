package basicExercisesPart1;
import java.util.Scanner;
/*115. Write a Java program to check if a positive number is a palindrome or not. 
Input a positive integer: 151
Is 151 is a palindrome number?
true*/
class Question115 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String k=Integer.toString(n);
		for(int i=0;i<k.length();i++) {
			if(k.charAt(i)==k.charAt(k.length()-i-1))
				continue;
			else {
				System.out.println("Not palindrome");
				return;
			}
		}System.out.println("Palindrome");
		
sc.close();}
}
