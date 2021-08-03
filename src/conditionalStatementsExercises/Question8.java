package conditionalStatementsExercises;
import java.util.Scanner;
/*8. Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant,
   depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1,
    print an error message. 

Test Data
Input an alphabet: p
Expected Output :
Input letter is Consonant*/ 
class Question8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		a=a.toUpperCase();
		if(a.length()>1||!(a.charAt(0)>=65&&a.charAt(0)<=90)) {
			System.out.println("Invalid input");
		}
		else {
				if(a.contains("A")||a.equals("E")||a.equals("I")||a.equals("O")||a.equals("U")) 
				{
					System.out.println("Input letter is vowel");
				}
				else {System.out.println("Input letter is consonant");}
			}
sc.close();}
}
