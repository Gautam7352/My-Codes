package conditionalStatementsExercises;
import java.util.Scanner;
/*19. Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row. Go to the editor

       1
      2 2
     3 3 3
    4 4 4 4 */
class Question19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number of rows:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=0;j--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
sc.close();}
}
