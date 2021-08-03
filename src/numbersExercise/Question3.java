package numbersExercise;
import java.util.*;
//3. Write a Java program to generate random integers in a specific range.
class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your range");
		System.out.println("Minimum number:");
		int x=sc.nextInt();
		System.out.println("Maximum number:");
		int y=sc.nextInt();
		
		double z=Math.random();
		z=x+(int)(z*(y-x+1));
		System.out.println(z);
sc.close();}
}
