class LargestOfThreeNumberCmdLineArgs{
	public static
	 void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

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
