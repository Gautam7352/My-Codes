package basicExercisesPart1;
import java.util.Scanner;
//114. Write a Java program to given a string and an offset, rotate string by offset (rotate from left to right).
class Question114 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		char[] c=n.toCharArray();
		char temp=c[n.length()-1];
		for(int i=n.length()-1;i>0;i--) {
			c[i]=c[i-1];
		}
		c[0]=temp;
		for(int i=0;i<n.length();i++)
			System.out.print(c[i]);
sc.close();}
}
