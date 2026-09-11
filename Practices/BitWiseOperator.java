import java.util.Scanner;
public class BitWiseOperator {
    
    public static void main(String []args){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter  A value:");
        int a = sc.nextInt();

        System.out.print("Entera B value:");
        int b = sc.nextInt();

        System.out.println("A & B = " + (a&b));
        System.out.println("A | B = " + (a|b));
        System.out.println("A ^ B = " + (a^b));
        System.out.println("A ~ B = " + (~a));
        System.out.println("A ~ B = " + (~b));
        System.out.println("A <<< = " + (a>>1));
        System.out.println("B <<< = " + (b>>1));
    }
}
