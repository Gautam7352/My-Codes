package dataTypesExercises;
import java.util.Scanner;
//12. Write a Java program to compare two given signed and unsigned numbers.
class Question12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want signed case(1) or unsigned case(2):");
		int x=sc.nextInt();
		
		switch (x) {
		case 1:
		{int a=-10;
		int b=10;
		if(a>b)
			System.out.println("a>b");
		else if(a<b)
			System.out.println("a<b");
		else if(a==b)
			System.out.println("a=b");}
		break;
		case 2:
		{int a=10;
		int b=10;
		if(a>b)
			System.out.println("a>b");
		else if(a<b)
			System.out.println("a<b");
		else if(a==b)
			System.out.println("a=b");}
		}
sc.close();}
}
