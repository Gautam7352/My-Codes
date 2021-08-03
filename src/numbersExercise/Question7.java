package numbersExercise;
/*7. Write a Java program to display first 10 lucus numbers. 
The Lucas numbers or series are an integer sequence named after the mathematician François Édouard Anatole Lucas, 
who studied both that sequence and the closely related Fibonacci numbers. Lucas numbers and Fibonacci numbers form complementary
 instances of Lucas sequences.
The sequence of Lucas numbers is: 2, 1, 3, 4, 7, 11, 18, 29, ….
Expected Output :

   First ten Lucas a numbers:                                              
2                                                                       
1                                                                       
3                                                                       
4                                                                       
7                                                                       
11                                                                      
18                                                                      
29                                                                      
47                                                                      
76*/
class Question7 {

	public static void main(String[] args) {
		int count=0;
		System.out.println("First 10 lucas number:");
		int a=2;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int c=0;
		while(count!=8) {
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
			++count;
		}
	}
}
