package OCT.ex_17102024_ifcondition_ifelse;

import java.util.Scanner;

public class Lab042
{
    public static void main(String[] args)
    {
       /*
        int l=10;
        int b=12;
        int h=10;
        */

        Scanner Scanner =new Scanner(System.in);

        System.out.println("Enter the l ");
        double l =Scanner.nextDouble();

        System.out.println("Enter the b ");
        double b =Scanner.nextDouble();

        System.out.println("Enter the h ");
        double h  =Scanner.nextDouble();

        if(l==b && b==h && h==l)
        {
            System.out.println("Equilateral triangle");
        }
        else if (l==b || b==h || h==l)
        {
            System.out.println("isosceles triangle");
        }
        else
        {
            System.out.println("Scalean triangle");
        }

        Scanner.close();

    }


}
