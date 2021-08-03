package conditionalStatementsExercises;
import java.util.Scanner;
/*20. Write a program in Java to print the Floyd's Triangle. Go to the editor

Test Data
Input number of rows : 5
Expected Output :

Input number of rows :  5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 */
class Question20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number of rows:");
		int n=sc.nextInt();
		int num=1;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(num+" ");
				num++;
			}System.out.println();
		}
		
sc.close();}
}
