package conditionalStatementsExercises;
import java.util.Scanner;
/*21. Write a program in Java to display the pattern like a diamond. Go to the editor

Test Data
Input number of rows (half of the diamond) : 7
Expected Output :

                                                                                 
      *                                                                          
     ***                                                                         
    *****                                                                        
   *******                                                                       
  *********                                                                      
 ***********                                                                     
*************                                                                    
 ***********                                                                     
  *********                                                                      
   *******                                                                       
    *****                                                                        
     ***                                                                         
      *      */
class Question21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number of rows:");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=n-i;j!=0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}System.out.println();
		}
		
		for(int i=n-1;i>0;i--) {
			for(int j=n-i;j!=0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}System.out.println();
		}
		
sc.close();}
}
