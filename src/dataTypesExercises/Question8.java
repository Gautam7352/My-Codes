package dataTypesExercises;
import java.util.Scanner;
/*8. Write a Java program that reads a number and display the square, cube, and fourth power.

Expected Output:
Square: .2f
Cube: .2f
Fourth power: 50625.00*/
class Question8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to be shown power of");
		int num=sc.nextInt();
		System.out.println("Square of number is: "+Math.pow(num, 2));
		System.out.println("Square of number is: "+Math.pow(num, 3));
		System.out.println("Square of number is: "+Math.pow(num, 4));
sc.close();}
}
