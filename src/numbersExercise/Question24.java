package numbersExercise;
import java.util.Scanner;
class Question24 {
/*24. Write a Java program to check if a number is palindrome or not. Go to the editor
In number system a palindromic number is a number that is the same when written forwards or backwards, i.e., of the form .
The first few palindromic numbers are therefore are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, …

Expected Output
Input a number: 5                                                       
It is a Palindrome number. */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int rev=0,temp=num,tens=10;
		while(temp>0) {
			rev=tens*rev+(temp%10);
			temp/=10;
		}
		if(rev==num)
			System.out.println("Palindrome");
		else System.out.println("Not palindrome");

	}
}
