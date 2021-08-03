package conditionalStatementsExercises;
import java.util.Scanner;
/*15. Write a program in Java to display the n terms of odd natural number and their sum. Go to the editor

Test Data
Input number of terms is: 5
Expected Output :

The odd numbers are :                                                            
1                                                                                
3                                                                                
5                                                                                
7                                                                                
9                                                                                
The Sum of odd Natural Number upto 5 terms is: 25*/
class Question15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of terms ");
		int i=sc.nextInt();
		int y=1,sum=0;
		for(int x=0;x<i;x++) {
			System.out.println(y);
			sum=sum+y;
			y=y+2;
		}System.out.println("The Sum of odd Natural Number upto "+5+" terms is: "+sum);
sc.close();}
}
