package numbersExercise;
/*8.Write a Java program to print out the first 10 Catalan numbers by extracting them from Pascal's triangle. 
In combinatorial mathematics, the Catalan numbers form a sequence of natural numbers that occur in various counting problems,
 often involving recursively-defined objects. They are named after the Belgian mathematician Eugène Charles Catalan.
The first Catalan numbers for n = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, 16796, 58786, 208012, 742900,
 2674440, 9694845, 35357670, 129644790, 477638700, 1767263190, 6564120420, 24466267020, 91482563640, 343059613650, 1289904147324, 
 4861946401452,

List 10 Catalan numbers:-                                               
                                                                        
1                                                                       
2                                                                       
5                                                                       
14                                                                      
42                                                                      
132                                                                     
429                                                                     
1430                                                                    
4862                                                                    
16796  */
class Question8 {
	
	static long factorial(int x) {
		long fact=1;
		for(int i=1;i<=x;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	static double catalan(int n){
		return factorial(2*n)/(factorial(n+1)*factorial(n));
	}

	public static void main(String[] args) {
		System.out.println("First 10 Catalan numbers:");
		for(int i=0;i<11;i++) {
			System.out.println(catalan(i));
		}
	}
}
