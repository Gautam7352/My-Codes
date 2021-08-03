package conditionalStatementsExercises;
import java.util.Scanner;
/*1. Write a Java program to get a number from the user and print whether it is positive or negative. 

Test Data
Input number: 35
Expected Output :
Number is positive*/
class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of coins: ");
		int n=sc.nextInt();
		if(n>0)
			System.out.println("Number is positive");
		else
			System.out.println("Number is negative");
sc.close();	}
}
