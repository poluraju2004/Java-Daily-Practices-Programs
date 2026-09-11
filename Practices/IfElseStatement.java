import java.util.Scanner;
public class IfElseStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number");
        int n = sc.nextInt();

        if (n % 2 == 0){
            System.out.println("Even Number = "+ n);
        }
        else {
            System.out.println("Odd Number = "+n);
        }
    }
    
}
