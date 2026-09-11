import java.util.*;
class Errors{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		/*System.out.print("Enter a value: ");
		float a = sc.nextFloat();
		System.out.print("Enter b value: ");
		float b = sc.nextFloat();

		System.out.println(a/b);// Enter a value: 5 Enter b value: 0 Infinity
		// Enter a value: -5 Enter b value: 0 -Infinity

		System.out.print("Enter a value: ");
		int x = sc.nextInt();
		System.out.print("Enter b value: ");
		int y = sc.nextInt();
		System.out.println(x/y); // Exception in thread "main" java.lang.ArithmeticException: / by zero at Errors.main(Errors.java:16)*/

		System.out.print("Enter a byte value: ");
		byte b = sc.nextByte();
		
		// b = b + 5;//error: incompatible types: possible lossy conversion from int to byte
		b = (byte)(b+5);

		System.out.println(b);

	}
}