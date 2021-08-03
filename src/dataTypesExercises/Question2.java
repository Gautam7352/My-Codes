package dataTypesExercises;
import java.io.*;
/*Q2. Write a Java program that reads a number in inches, converts it to meters. 
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters
*/
class Question2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input value in inch");
		int inch=Integer.parseInt(sc.readLine());
		double m=inch*0.0254;
		System.out.println("Value in mewtre is");
		System.out.println(m);
sc.close();}
}
