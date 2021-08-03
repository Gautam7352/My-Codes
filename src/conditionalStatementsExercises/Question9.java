package conditionalStatementsExercises;
import java.util.Scanner;
/*9. Write a Java program that takes a year from user and print whether that year is a leap year or not. Go to the editor

Test Data
Input the year: 2016
Expected Output :
2016 is a leap year*/
class Question9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the year: ");
		int n=sc.nextInt();
		if((n%100==0&&n%400!=0)||n%4!=0)
		System.out.println(n+" is not a leap year");
		else System.out.println(n+" is a leap year");
sc.close();}
}