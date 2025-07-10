import java.util.Scanner;

public class assignment4 {
    public static void main (String[] args)
    {
    Scanner Sc = new Scanner(System.in);
    int age ;
    String nationality;
    System.out.println("Enter your age : ");
    age = Sc.nextInt();
    System.out.println("Enter your nationality : ");
    nationality = Sc.next();
    nationality = nationality.toUpperCase();
    if(nationality.equals("EGYPTIAN")&age>=18)
        {
        System.out.println("Eligible to vote");
        }
    else
        {
        System.out.println("Not eligible to vote");
        }
    }
}
