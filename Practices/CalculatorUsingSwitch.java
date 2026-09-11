import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        double a = sc.nextDouble();

        System.out.print("Enter a value: ");
        double b = sc.nextDouble();

        System.out.print("Enter a Operator(+,-,*,/,%) ");
        char c = sc.next().charAt(0);

        switch (c) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;
            case '-':
                System.out.println("Result = " + (a + b));
                break;
            case '*':
                System.out.println("Result = " + (a + b));
                break;
            case '/':
                 if (b == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    System.out.println("Result = " + (a / b)); 
                }
                break;
            case '%':
                System.out.println("Result = " + (a + b));
                break;
            
            default:
                System.out.println("Invalid Operator");
        }
        sc.close();
    }

}
