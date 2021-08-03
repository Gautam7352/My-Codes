package basicExercisesPart1;
import java.util.Scanner;
/*113. Write a Java program to merge two given sorted array of integers and create a new sorted array. Go to the editor
array1 = [1,2,3,4]
array2 = [2,5,7, 8]
result = [1,2,2,3,4,5,7,8]*/
class Question113 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Length of 1st array: ");
		int i=sc.nextInt();
		System.out.println("Length of 2nd array: ");
		int j=sc.nextInt();
		int[] a=new int[i];
		int[] b=new int[j];
		int[] result=new int[i+j];
		System.out.println("Input values of 1st array");
		for(int k=0;k<i;k++) {
			a[k]=sc.nextInt();
		}
		System.out.println("Input values of 2nd array");
		for(int k=0;k<j;k++) {
			b[k]=sc.nextInt();
		}
		int s=0,t=0;
		
		for(int x=0;x<i+j;x++) 
		{
			if(s<i&&t<j&&(a[s]<b[t])) 
			{
				result[x]=a[s++];
			} 
			
			else 
			{
				result[x]=b[t++];
			}
		}
		
		for(int z=0;z<i+j;z++) {
			System.out.print(result[z]);
		}
sc.close();}
}
