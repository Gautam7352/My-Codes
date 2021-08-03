package questions;
import java.util.Scanner;
class FibonacciSequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers are there in your sequence?");
		int n=sc.nextInt();
		int fib1=0;//this denotes the current number of the sequence
		int fib2=0;//this is used to store previous number in the sequence

		for(int i=0;i<n;i++) {
			if(i==0||i==1)//this block will give values when i is 0 or 1
				fib1=i;
			else
			{//this block will firstly store previous value of fib1 then update value of fib1 then give previous value to fib2 in the sequence
				int temp=0;
				temp=fib1;	
				fib1=fib2+fib1;
				fib2=temp;
			}
			System.out.print(fib1+" ");
		}
sc.close();}
}