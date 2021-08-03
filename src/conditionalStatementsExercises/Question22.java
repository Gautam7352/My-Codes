package conditionalStatementsExercises;
import java.util.Scanner;
/*22. Write a Java program to display Pascal's triangle. 

Test Data
Input number of rows: 5
Expected Output :

Input number of rows: 5                                                          
      1                                                                          
     1 1                                                                         
    1 2 1                                                                        
   1 3 3 1                                                                       
  1 4 6 4 1     */
class Question22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number of rows:");
		int n=sc.nextInt();
		int formula=1;
		String k=" ";
		for(int i=0;i<=n;i++) {
			for(int j=n-i;j!=0;j--) {
				System.out.print(" ");
			}
			
			
			k=Integer.toString(formula);
			System.out.print(k.split("")+" ");
			System.out.println();
		}
		
sc.close();}
}
