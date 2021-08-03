package dataTypesExercises;
import java.io.*;
/*Q1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. Go to the editor
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius*/
class Question1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("Enter value of temperature in farenheit:");
	      int F = Integer.parseInt(sc.readLine());
	      int C=(F-32)*5/9;
	      System.out.println("Value of temperature in Celsius:");
	      System.out.println(C);
sc.close();}
}