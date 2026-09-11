class TempCelsiusFahrenheit{

	public static void main(String args[]){
		int c = Integer.parseInt(args[0]);

		int fahrenheit = (c*9/5)+32;

		System.out.println("Temp = "+ fahrenheit);
	}

}