package conditionalStatementsExercises;
import java.util.Scanner;
/*7. Write a Java program to find the number of days in a month. 

Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days*/
class Question7 {
	static boolean leapTest(int year){
		boolean LeapYear=false;
		if(year%4==0||(year%100==0&&year%400==0))
			LeapYear=true;
		return LeapYear;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a month number: ");
		int month=sc.nextInt();
		System.out.print("Input an year: ");
		int year=sc.nextInt();
		int days=0;
		String name="";
		switch (month) {
		case 1:{ 
			name="January";
			days=31;}
		break;
		case 2:{
		
		name="February";
		if(leapTest(year))
				days=29;
			else
				days=28;
		}break;
		case 3:days=31;
		break;
		case 4: days=30;
		break;
		case 5:days=31;
		break;
		case 6: days=30;
		break;
		case 7:days=31;
		break;
		case 8:days=31;
		break;
		case 9: days=30;
		break;
		case 10:days=31;
		break;
		case 11: days=30;
		break;
		case 12:days=31;
		break;
		}
		System.out.println(name+" "+year+" has "+days+" days");
sc.close();}
}
