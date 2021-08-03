package conditionalStatementsExercises;

import java.util.Scanner;

/*4. Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
  Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000. 

Test Data
Input a number: 25
Expected Output :
Input value: 25
Positive number*/
class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the number:");
		float num=sc.nextFloat();
		
		if(num==0)
			System.out.println("zero");
		else if(num>0)
			System.out.println("Positive");
		else System.out.println("Negative");
		
		if(Math.abs(num)<1)
			System.out.println("small");
		
		if(Math.abs(num)>1000000)
			System.out.println("Large");
sc.close();	}
}
