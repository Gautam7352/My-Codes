package numbersExercise;
import java.util.Scanner;
/*18. Write a Java program to check a number is a cube or not. 
In arithmetic and algebra, the cube of a number n is its third power: the result of the number multiplied by itself twice:
n^3 = n × n × n.
Input Data:
Input a number: 8
Expected Output

Number is a cube.*/
class Question18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=0;i*i*i<=n;i++) {
			if(n==i*i*i) {
				System.out.println("Number is a cube");
			return;}
		}
		System.out.println("Number is not a cube");
		
	}
}
