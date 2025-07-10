import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
    double x , y ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first num : ");
    x = sc.nextDouble();
    System.out.print("Enter second num : ");
    y = sc.nextDouble();
    double sum = x + y;
    double diff = x - y;
    double prod = x * y;
    double div = x / y;
    System.out.println("sum = " + sum);
    System.out.println("Difference = " + diff);
    System.out.println("Product = " + prod);
    System.out.println("Quotient = " + div);
    }
}
