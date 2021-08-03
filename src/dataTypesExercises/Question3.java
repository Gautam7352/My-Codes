package dataTypesExercises;
import java.io.*;
/*Q3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 

Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16*/
class Question3 {

	public static void main(String[] args) throws IOException {
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input an integer between 0 and 1000: 565");
		int n=Integer.parseInt(sc.readLine());
		if(n<0||n>1000)
			System.out.println("number out of range");
		else {
			System.out.print("The sum of all digits in "+n);
			int sum=0;
			while(n>0) {
				int r=n%10;
				sum=sum+r;
				n=n/10;
			}
			System.out.println(" is "+sum);
		}
sc.close();	}
}
