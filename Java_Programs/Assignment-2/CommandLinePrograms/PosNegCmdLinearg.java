class PosNegCmdLinearg{
	 public static void main(String args[]){
	 	int n = Integer.parseInt(args[0]);

	 	if (n>0){
	 		System.out.println("It is a Positive Number");
	 	} 
	 	else if(n<0){
	 		System.out.println("It is a Negative Number");

	 	}
	 	else{
	 		System.out.println("It is zero Number");
	 	}
		
	}
	
}