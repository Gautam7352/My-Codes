package conditionalStatementsExercises;
import java.util.Scanner;
/*6. Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places. Go to the editor

Test Data
Input floating-point number: 25.586
Input floating-point another number: 25.589
Expected Output :
They are different*/
class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input floating-point number: ");
		float x=sc.nextFloat();
		System.out.println("Input floating-point another number: ");
		float y=sc.nextFloat();
		
		x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;
        
        if(x==y)
        	System.out.println("They are same");
        else System.out.println("They are different");
sc.close();}
}
