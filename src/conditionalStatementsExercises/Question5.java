package conditionalStatementsExercises;
import java.util.Scanner;
/*5. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday. 

Test Data
Input number: 3
Expected Output :
Wednesday*/
class Question5 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a number from 1 to 7");
		int x=sc.nextInt();
		if(x>7||x<1) {
			System.out.println("Number not in range");
			}
		switch(x) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
		System.out.println("Sunday");}
sc.close();}
}
