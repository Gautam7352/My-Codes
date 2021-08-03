package numbersExercise;
/*28. Write a Program in Java to check whether a number is an Armstrong Number or not. 
Armstrong (Michael F. Armstrong) number is a number that is equal to the sum of cubes of its digits. 
For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers
Expected Output

Input an integer:  153
Is Armstrong number? true*/
class Question28 {
	static int SOP(int x) {
		int SOP=0;
		String s=String.valueOf(x);
		int Pow=s.length();
		while(x>0) {
			SOP=SOP+(int)Math.pow(x%10, Pow);
			x/=10;
		}
		return SOP;
	}
	public static void main(String[] args) {
		int x=153;
		if(SOP(x)==x)
			System.out.println("The number is armstrong number");
		else
			System.out.println("The number is not an armstrong number");
	}
}
