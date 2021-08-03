package numbersExercise;
import java.util.Scanner;
/*16. Write a Java program to check two numbers are Amicable numbers or not. 
Amicable numbers are two different numbers so related that the sum of the proper divisors of each is equal to the other number.
The first ten amicable pairs are: (220, 284), (1184, 1210), (2620, 2924), (5020, 5564), (6232, 6368), (10744, 10856), (12285, 14595), 
(17296, 18416), (63020, 76084), and (66928, 66992).
Expected Output

Input the first number: 220                                             
Input the second number: 284                                            
These numbers are amicable.*/
class Question16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the first number: ");
		int x=sc.nextInt();
		System.out.println("Input the second number: ");
		int y=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<x;i++) {
			if(x%i==0) 
			sum=sum+i;
		}
		if(sum==y)
		System.out.println("amicable");
		else 
			System.out.println("not amicable");
sc.close();}
}
