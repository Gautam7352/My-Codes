package dataTypesExercises;
import java.io.*;
/*4. Write a Java program to convert minutes into a number of years and days. 

Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days*/
class Question4 {

	public static void main(String[] args) throws IOException {
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input the number of minutes: ");
		int min=Integer.parseInt(sc.readLine());
		System.out.print(min+" minutes is approximately ");
		int day=(min/60)/24;
		int year=day/365;
		day=day%365;
		System.out.print(year+" year "+day +" days ");
sc.close();}
}
