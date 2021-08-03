package conditionalStatementsExercises;
import java.util.Scanner;
/*12. Write a program in Java to input 5 numbers from keyboard and find their sum and average. Go to the editor

Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :

Input the 5 numbers :                                                            
1                                                                                
2                                                                                
3                                                                                
4                                                                                
5                                                                                
The sum of 5 no is : 15                                                          
The Average is : 3.0       */
class Question12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the 5 numbers :");
		int[] i=new int[5];
		for(int x=0;x<5;x++) {
			i[x]=sc.nextInt();
		}
		int sum=0;
		for(int x=0;x<i.length;x++) {
			sum=sum+i[x];
		}
		System.out.println("The sum of 5 no is : "+sum);
		System.out.println("The average is: "+(float)sum/5);
sc.close();}
}
