package dataTypesExercises;
import java.util.Scanner;
/*6. Write a Java program to compute body mass index (BMI). 
Test Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Body Mass Index is 61.30159143458721
*/
class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Weight in pounds");
		int weight=sc.nextInt();
		System.out.println("Enter Height in inches");
		int height=sc.nextInt();
		double BMI=(weight*703)/height/height;
		System.out.println("Body Mass Index is "+BMI);
sc.close();}
}
