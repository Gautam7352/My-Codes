package conditionalStatementsExercises;
/*17. Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.
 The pattern is as follows : 
1
22
333
4444*/
class Question17 {

	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			for(int y=0;y<i;y++) {
				System.out.print(i);
			}System.out.println();
		}
	}
}
