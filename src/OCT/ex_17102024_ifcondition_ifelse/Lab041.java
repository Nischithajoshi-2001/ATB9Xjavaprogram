package OCT.ex_17102024_ifcondition_ifelse;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab041
{
    public static void main(String[] args)
    {
        /*
        Grade calculator
        A= 90-100;
        B= 80-89;
        c=70-79;
        D=60-69;
        F=0-59;
         */
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the score");
        int num=Scanner.nextInt();
        char Grade ='F';


        //int num=62;

        if(num>=91 && num<=100)
        {
            System.out.println("A");
        }
        else if (num>=81 && num<=90)
        {
            System.out.println("B");
        }
        else if (num>=71 && num<=80)
        {
            System.out.println("C");
        }
        else if (num>=61 && num<=70)
        {
            System.out.println("D");
        }
        else if (num>=0 && num<=60)
        {
            System.out.println("F");
        }
        else
        {
            System.out.println("Lol");
        }

        Scanner.close();

    }

}
