import java.util.Scanner;

public class assignment5 {
    public static void main (String[] args) {

    //print numbers 1 to 10 ussing loop
    for  (int i = 1; i <=10; i++)
    {
        System.out.print(i +"  ");
    }
        System.out.println(" ");

    // use if to check is a number is even or odd
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num= Sc.nextInt();
    if ( num%2==0 )
    {
        System.out.println("The number "+num+" is even");
    }
    else
    {
        System.out.println("The number "+num+" is odd");
    }

    //use swich to display the name of the day (1-7)
    System.out.println("Enter a number of the day : ");
    int day= Sc.nextInt();
    switch(day) {
        case 1 : System .out.println("sunday"); break;
        case 2 : System .out.println("monday"); break;
        case 3 : System .out.println("tuesday"); break;
        case 4 : System .out.println("wednesday"); break;
        case 5 : System .out.println("thursday"); break;
        case 6 : System .out.println("friday"); break;
        case 7 : System .out.println("saturday"); break;
    }

    // print multiplication table (1 to 10 ) for
    for (int i=1 ; i<=10; i++)
    {
        for ( int j=i ; j<=10; j++)
        {
            System.out.print(" ( " + i + " * " + j + " = " + i*j + " ) ");
        }
        System.out.println(" ");
    }

    // count digits in a number while
    System.out.println(" enter a number to count digits: ");
    int numd= Sc.nextInt();
    int dig=0;
    while (numd!=0)
    {
        numd= numd/10 ;
        dig++;
    }
    System.out.println("The number digits :"+ dig);

    //reverse a number while
    System.out.println("The number to reverse : ");
    int numr = Sc.nextInt();
    int renum =0;
    int x;
    while (numr!=0)
    {
        x =numr%10 ;
        renum=renum*10 + x;
        numr=numr/10 ;
    }
    System.out.println("The number reverse : "+ renum);
    }
}
