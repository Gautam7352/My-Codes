package numbersExercise;
import java.util.Scanner;
/*15. Write a Java program to check whether a number is a Duck Number or not. 
Note: A Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number.
For example 3210, 7056, 8430709 are all duck numbers whereas 08237, 04309 are not.
Expected Output

Input a number : 3210                                                   
Duck number*/
class Question15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		sc.close();
		char c=x.charAt(0);
		int x1=Integer.parseInt(x);
		boolean bool =false;
		
		while(x1>0) {
			if(x1%10==0) {
				bool=true;
			break;}
			x1=x1/10;
		}

		if(c!='0'&&bool)
			System.out.println("duck number");
		else
			System.out.println("Not duck number");
	}
}
