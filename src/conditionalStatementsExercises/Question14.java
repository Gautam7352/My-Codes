package conditionalStatementsExercises;
import java.util.Scanner;
/*14. Write a program in Java to display the multiplication table of a given integer. 

Test Data
Input the number (Table to be calculated) : Input number of terms : 5
Expected Output :

                                                                        
5 X 1 = 5                                                                        
5 X 2 = 10                                                                       
5 X 3 = 15                                                                       
5 X 4 = 20                                                                       
5 X 5 = 25
*/
class Question14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number (Table to be calculated) : Input number of terms :");
		int i=sc.nextInt();
		for(int x=0;x<=10;x++) {
			System.out.println(i+" X "+x+" = "+x*i);
		}
sc.close();}
}