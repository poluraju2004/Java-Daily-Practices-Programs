import java.util.*;
class Vowels{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Alphabets: ");
		char ch = sc.next().charAt(0);
		

		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
			System.out.println("It is a Vowels");
		}
		else{
			System.out.println("It is a Consonant");
		}
	}
}	