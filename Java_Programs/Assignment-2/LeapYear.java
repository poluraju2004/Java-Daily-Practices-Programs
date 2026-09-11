import java.util.*;

class LeapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Leap Year: ");

		int year = sc.nextInt();
 
		if((year % 400 == 0)||(year % 4==0 && year % 100 != 0)){
			System.out.println("It is a leap year");
		}
		else{
			System.out.println("It is a not leap year");

		}
	}
}