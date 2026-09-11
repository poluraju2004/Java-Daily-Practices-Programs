import java.util.Scanner;
public class ArithmeticOperators {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A Value:");
        int a = sc.nextInt();
        System.out.print("Enter B Value:");
        int b = sc.nextFloat();

        System.out.println("A + B = "+(a+b));
        System.out.println("A - B = "+(a-b));
        System.out.println("A * B = "+(a*b));
        System.out.println("A / B = "+(a/b));
        System.out.println("A % B = "+(a%b));
        System.out.println("B / A = "+(b/a));
        
        
    }
    
}
