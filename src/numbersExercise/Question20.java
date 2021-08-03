package numbersExercise;
/*20. Write a Java program to display first 10 Fermat numbers. 
In mathematics, a Fermat number is a positive integer of the form Fermat Number
where n is a nonnegative integer.
The first few Fermat numbers are:
3, 5, 17, 257, 65537, 4294967297, 18446744073709551617, …
Expected Output

3.0                                                                     
5.0                                                                     
17.0                                                                    
257.0                                                                   
65537.0                                                                 
4.294967297E9                                                           
1.8446744073709552E19                                                   
3.4028236692093846E38                                                   
1.157920892373162E77                                                    
1.3407807929942597E154                                                  
Infinity   */
class Question20 {
	static double Fermat(int n) {
		return Math.pow(2, Math.pow(2, n));
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(Fermat(i));
		}
	}
}
