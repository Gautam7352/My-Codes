package conditionalStatementsExercises;
/*18. Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like : 

1
2 3
4 5 6
7 8 9 10 */
class Question18 {

	public static void main(String[] args) {
		int count=1;
		for(int i=0;i<=4;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(count++ +" ");
			}System.out.println();
		}
	}
}
