import java.util.Scanner;

public class assignment6 {
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int nos = Sc.nextInt();
        double fexams , sexams , texams ;
        for(int i = 1; i <= nos; i++)
        {
            System.out.println("Enter the student num "+i+" name : ");
            String name  = Sc.next();
            System.out.println("Enter the exam number 1 score :" );
            fexams = Sc.nextDouble();
            System.out.println("Enter the exam number 2 score :" );
            sexams = Sc.nextDouble();
            System.out.println("Enter the exam number 3 score :" );
            texams = Sc.nextDouble();
            System.out.println("Student name : " + name );
            double saver = aver(fexams,sexams,texams);
            System.out.println("Sversge score : " +saver  );
            char sgrade = grade(saver) ;
            System.out.println("Student grade : " +sgrade );
        }
    }

    public static double aver(double x, double y, double z)
    {
        return ((x+y+z)/3);
    }
    
    public static char grade(double x)
    {
        char grade ;
        if (x>=85)
        {
             grade = 'A' ;
        }
        else if (x>=70)
        {
            grade = 'B' ;
        }
        else if (x>=50)
        {
            grade = 'C' ;
        }
        else
        {
            grade = 'F' ;
        }
    return grade ;
    }
}
