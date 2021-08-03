package basicExercisesPart1;
import java.util.Arrays;
import java.util.Scanner;
/*128.Write a Java program to calculate the median of a given unsorted array of integers. 
Original array: [10, 2, 38, 22, 38, 23]
Median of the said array of integers: 30
Original array: [10, 2, 38, 23, 38, 23, 21]
Median of the said array of integers: 23*/
class Question128 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input number elements in data");
		int x=sc.nextInt();
		int[] arr=new int[x];
		int median=0;
		System.out.println("input unsorted data");
		for(int i=0;i<x;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		if(x%2==0) 
			median=(arr[x/2]+arr[(x/2)+1])/2;
		else
			median=arr[(x/2)+1];
		System.out.println(median);
sc.close();}
}
