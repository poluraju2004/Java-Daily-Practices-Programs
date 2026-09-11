import java.util.Scanner;
public class RelationalOperator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  A value:");
        int a = sc.nextInt();

        System.out.print("Enter B value:");
        float b = sc.nextFloat();

        System.out.println("A == B  = "+(a == b));
        System.out.println("A != B  = "+(a != b));
        System.out.println("A > B  = "+(a > b));
        System.out.println("A >= B  = "+(a >= b));
        System.out.println("A < B  = "+(a < b));
        System.out.println("A <= B  = "+(a <= b));
        


    }
}
