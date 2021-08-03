package conditionalStatementsExercises;
import java.util.Scanner;
/*16. Write a program in Java to display the pattern like right angle triangle with a number. 

Test Data
Input number of rows : 10
Expected Output :

1                                                                                
12                                                                               
123                                                                              
1234                                                                             
12345                                                                            
123456                                                                           
1234567                                                                          
12345678                                                                         
123456789                                                                        
12345678910*/
class Question16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of rows : ");
		int i=sc.nextInt();
		for(int x=0;x<i;x++) {
			for(int y=1;y<=x+1;y++) {
				System.out.print(y);
			}System.out.println();
		}
sc.close();}
}
