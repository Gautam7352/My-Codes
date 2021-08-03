package dataTypesExercises;
import java.io.*;
/*10. Write a Java program to break an integer into a sequence of individual digits. 

Test Data
Input six non-negative digits: 123456
Expected Output :
1 2 3 4 5 6*/
class Question10 {

	public static void main(String[] args) throws IOException {
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input six non-negative digits: ");
		int n=Integer.parseInt(sc.readLine());
		int tens=100000;
		while(n>0) {
			System.out.print(n/tens+" ");
			n=n%tens;
			tens=tens/10;
		}
sc.close();}
}