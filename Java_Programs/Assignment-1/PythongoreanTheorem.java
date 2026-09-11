class PythongoreanTheorem{

	public static void main(String[] args){

		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);

		double c = Math.sqrt(a*a + b*b);

		System.out.println("Pythongorean theroem =  "+ c );
	}
}