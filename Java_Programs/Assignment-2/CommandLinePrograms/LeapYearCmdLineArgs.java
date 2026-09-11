class LeapYearCmdLineArgs{
	public static void main(String args[]){
		int year = Integer.parseInt(args[0]);
		
 
		if((year % 400 == 0)||(year % 4==0 && year % 100 != 0)){
			System.out.println("It is a leap year");
		}
		else{
			System.out.println("It is a not leap year");

		}
	}
}