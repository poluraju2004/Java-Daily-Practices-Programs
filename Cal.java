class Cal{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);//10
		int b = Integer.parseInt(args[2]);//20
		char operater = (args[1]).charAt(0);

		switch(operater){
		case '+':
			System.out.println("a + b = "+ (a+b));
			break;
		case '-':
			System.out.println("a - b = "+ (a-b));
			break;
		case '*':
			System.out.println("a * b = "+ (a*b));
			break;
		case '/':
			if(b!=0)
				System.out.println("a / b = "+ (a/b));
			else
				System.out.println("zero divisible error");
			    break;
		case '%':
			System.out.println("a % b = "+ (a%b));
			break;
		default:
			System.out.println("Invalid Operator!");
		}

	}
	
}