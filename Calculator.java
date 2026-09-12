class Calculator{
	int a;
	int b;

	public Calculator(int a, int b){
		this.a = a;
		this.b = b;
	}

	public void addition(){
		System.out.println( "Addition = " + (a+b) );
	}

	public void subtraction(){
		System.out.println( "Subtraction = "+(a-b));
	}

	public void multiplication(){
		System.out.println( "Multiplication = "+(a*b));
	}

	public void division(){
		System.out.println( "Division = "+(a/b));
	}

	public void modulus(){
		System.out.println("Modulus = "+(a%b));
	}

	public static void main(String[] args) {
		Calculator c1 = new Calculator(10, 20);
		c1.addition();
		c1.subtraction();
		c1.multiplication();
		c1.division();
		c1.modulus();

	}
}
