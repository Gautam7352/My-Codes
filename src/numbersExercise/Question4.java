package numbersExercise;
/*4. Write a Java program to generate and show all Kaprekar numbers less than 1000. 
Expected Output :

1       1         0 + 1                                  
9       81        8 + 1                                  
45      2025      20 + 25                                
55      3025      30 + 25                                
99      9801      98 + 01                                
297     88209     88 + 209                               
703     494209    494 + 209                              
999     998001    998 + 001                              
8 Kaprekar numbers.  */
class Question4 {
	
	public static boolean test(int i) {
		boolean test=false;
		if(i==1)
			return true;
		
		int square=i*i;	//squared given number
		
		//counting number of digits in the squared number
		int n=square;int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        if(count%2!=0)
        	count++;
        //Splitting the number in half
		int NumSplit=(int)Math.round(Math.pow(10, (count)/2));
		
		int a=square/NumSplit;
		int b=square%NumSplit;
		
		if((a+b)==i)
			test=true;
		
		return test;
	}
	
	public static void main(String[] args) {
		System.out.println("Kaprekar numbers less than 1000");
		int count=0;
		for(int i=1;i<1000;i++) {
			if(test(i)) 
			++count;
		}
		System.out.println(count);
	}
}
