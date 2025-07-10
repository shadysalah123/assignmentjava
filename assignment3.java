import java.util.Scanner;

public class assignment3 {
    public static void main (String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.print("Enter a sentence : ");
    String sent = Sc.nextLine();
    System.out.println("UPpercase : " + sent.toUpperCase() + "!");
    System.out.println("Length : " + sent.length());
    System.out.println("First character : " + sent.charAt(0));
    }
}
