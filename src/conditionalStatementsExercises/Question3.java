package conditionalStatementsExercises;

import java.util.Scanner;

/*3. Take three numbers from the user and print the greatest number. Go to the editor

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87*/
class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a:");
		int a=sc.nextInt();
		System.out.println("Input b:");
		int b=sc.nextInt();
		System.out.println("Input c:");
		int c=sc.nextInt();
		
		if(a>=b&&b>=c||a>=c&&c>=b)
			System.out.println("The greatest number is "+a);
		if(b>=a&&a>=c||b>=c&&c>=a)
			System.out.println("The greatest number is "+b);
		if(c>=b&&b>=a||c>=a&&a>=b)
			System.out.println("The greatest number is "+c);
sc.close();}
}
