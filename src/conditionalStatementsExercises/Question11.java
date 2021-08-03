package conditionalStatementsExercises;
import java.util.Scanner;
/*11. Write a program in Java to display n terms of natural numbers and their sum. 

Test Data
Input the number: 2
Expected Output :

Input number:                                                                    
2                                                                                
The first n natural numbers are :                                                
2                                                                                
1                                                                                
2                                                                                
The Sum of Natural Number upto n terms :                                         
23*/
class Question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number: ");
		int n=sc.nextInt();
		System.out.println("The first n natural numbers are :");
		int sum=0;
		for(int i=1;i<=n;i++) {
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("The Sum of Natural Number upto n terms :"+sum);
sc.close();}
}
