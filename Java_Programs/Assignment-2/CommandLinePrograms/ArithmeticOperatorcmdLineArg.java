class ArithmeticOperatorcmdLineArg{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		char operator  = (args[2]).charAt(0);

		switch(operator){

		case '+':
			System.out.println("a+b = : "+(a+b));
			break;
		case '-':
			System.out.println("a-b = : "+(a-b));
			break;
		case 'x':
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