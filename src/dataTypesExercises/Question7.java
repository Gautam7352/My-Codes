package dataTypesExercises;
import java.util.Scanner;
/*Q7. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed
  	  in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters). 

Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804*/
class Question7 {
	static float hrconv(float hr,float min,float sec) {
		hr=hr+(min/60)+(sec/3600);
		return hr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter distance in metre");
		double m=sc.nextInt();
		System.out.println("Enter the time (in 'hr min sec' format)");
		float hr=sc.nextInt();
		float min=sc.nextInt();
		float sec=sc.nextInt();
		System.out.println("Speed in m/s: "+(m/((hr*3600)+(min*60)+sec)));
		hr=hrconv(hr, min, sec);
		System.out.println("Speed in km/hr: "+((m/1000)/hr));
		System.out.println("Speed in miles/hr: "+((m/1609)/hr));
sc.close();}
}
