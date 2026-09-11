import java.util.*;
class ArithmeticOperator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		System.out.print("Enter b number: ");
		int b = sc.nextInt();
		System.out.print("Enter operator number(+,-,*,/): ");
		char operator = sc.next().charAt(0);

		switch(operator){

		case '+':
			System.out.println("a+b = : "+(a+b));
			break;
		case '-':
			System.out.println("a-b = : "+(a-b));
			break;
		case '*':
			System.out.println("a*b = : "+(a*b));
			break;
		case '/':
			if(b !=0)
			System.out.println("a/b = : "+(a/b));
		else 
			System.out.println("cannot be divisibe zero");
			break;
		default:
			System.out.println("Invalid Operator");

		}

	}
	
}