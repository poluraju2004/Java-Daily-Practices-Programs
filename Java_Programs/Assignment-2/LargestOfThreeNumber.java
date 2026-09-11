import java.util.*;
class LargestOfThreeNumber{
	public static
	 void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int a = sc.nextInt();
		System.out.print("Enter b Number: ");
		int b = sc.nextInt();
		System.out.print("Enter c Number: ");
		int c = sc.nextInt();

		if(a>b && a>c){
			System.out.print("A is largest: "+ a);
		}
		else if(b>a && b>c){
			System.out.println("B is largest: "+ b);

		}
		else{
				System.out.print("C is largest: "+ c);
		}
	}

	
}
