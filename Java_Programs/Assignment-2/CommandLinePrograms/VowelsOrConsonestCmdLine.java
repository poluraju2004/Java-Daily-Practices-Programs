class VowelsOrConsonestCmdLine{
	public static void main(String args[]){

		char ch = args[0].charAt(0);
		

		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
			System.out.println("It is a Vowels");
		}
		else{
			System.out.println("It is a Consonant");
		}
	}
}	