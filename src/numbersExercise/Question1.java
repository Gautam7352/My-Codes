package numbersExercise;
import java.util.Scanner;
/*1. Write a Java program to check whether a given number is an ugly number. Go to the editor
In number system, ugly numbers are positive numbers whose only prime factors are 2, 3 or 5. First 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. By convention, 1 is included.
Test Date:Input an integer number: 235
Expected Output :
It is not an ugly number.*/
class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to be tested");
		int x=sc.nextInt();
		while(x%2==0) {
			x=x/2;
		}
		while(x%3==0) {
			x=x/3;
		}
		while(x%5==0) {
			x=x/5;
		}
		
		if(x==1)
			System.out.println("It is an ugly number");
		else
			System.out.println("It is not an ugly number");
		
sc.close();	}
}