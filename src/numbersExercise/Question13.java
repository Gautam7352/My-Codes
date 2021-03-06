package numbersExercise;
import java.util.Scanner;
/*13. Write a Java program to check whether a number is a Pronic Number or Heteromecic Number or not. 
A pronic number is a number which is the product of two consecutive integers, that is, a number of the form n(n + 1).
The first few pronic numbers are:
0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462 ? etc.

Expected Output
Input a number : 110
Pronic Number.*/
class Question13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			int k=i*(i+1);
			if(n==k) {
				System.out.println("Pronic number");
			return;}
		}
		System.out.println("Not Pronic number");
}
}
