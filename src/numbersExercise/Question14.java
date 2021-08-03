package numbersExercise;
import java.util.Scanner;
/*14. Write a Java program check whether a number is an Automorphic number or not. Go to the editor
In mathematics, an automorphic number is a number whose square "ends" in the same digits as the number itself. 
For example, 52 = 25, 6 = 36, 76 = 5776, and 890625 = 793212890625, so 5, 6, 76 and 890625 are all automorphic numbers.
Expected Output

Input a number : 76                                                   
Automorphic Number.*/
class Question14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		long Square=x*x;
		if((Square-x)%10==0)
			System.out.println("Automorphic Number");
		else 
			System.out.println("Not an Automorphic Number");
sc.close();
	}
}
