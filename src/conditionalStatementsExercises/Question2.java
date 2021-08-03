package conditionalStatementsExercises;
import java.util.Scanner;
/*2. Write a Java program to solve quadratic equations (use if, else if and else). 

Test Data
Input a: 1
Input b: 5
Input c: 1
Expected Output :
The roots are -0.20871215252208009 and -4.7912878474779195*/
class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a:");
		float a=sc.nextFloat();
		System.out.println("Input b:");
		float b=sc.nextFloat();
		System.out.println("Input c:");
		float c=sc.nextFloat();
		double D=((b*b)-(4*a*c))/(2*a);
		System.out.println("Your equation is: "+a+"x^2 + "+b+"x + "+c);
		if(D>0) {
		System.out.println("The roots are: "+((-b+Math.sqrt(D))/(2*a))+" and "+((-b-Math.sqrt(D))/(2*a)));}
		else if(D<0) {
			System.out.println("No real roots");}
		else 
			System.out.println("The root is: "+(-b/(2*a)));
sc.close();	}
}