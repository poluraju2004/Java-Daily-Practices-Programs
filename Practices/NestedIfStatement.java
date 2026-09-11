import java.util.Scanner;
public class NestedIfStatement {
    public static void main(String[] args){

    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int age = sc.nextInt();
    System.out.print("Are you Citizen (true/false)");
    boolean c = sc.nextBoolean();
    if (age >= 18){
        if (c){
            System.out.println("Are you Eligible");
        }
        else{
            System.out.println("you are Citizen ");
        }
    }
    else {
    System.out.println("are you under 18");
        }
    
    sc.close();
    }

    
}
