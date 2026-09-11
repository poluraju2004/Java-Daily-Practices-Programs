import java.util.Scanner;
class PosNeg{
	 public static void main(String args[]){
	 	Scanner sc = new Scanner(System.in);
	 	System.out.print("Enter a N number: ");
	 	int n = sc.nextInt();

	 	if (n>0){
	 		System.out.println("It is a Positive Number");
	 	} 
	 	else if(n<0){
	 		System.out.println("It is a Negative Number");

	 	}
	 	else{
	 		System.out.println("It is zero Number");
	 	}
		
	}
	
}