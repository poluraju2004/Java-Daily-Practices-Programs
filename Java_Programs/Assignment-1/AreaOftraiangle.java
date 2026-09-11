class AreaOftraiangle{

	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		double s = (a+b+c)/2;
		double A = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		System.out.println("S = "+ s);
		System.out.println("A = "+ A);

		

	}
	
}