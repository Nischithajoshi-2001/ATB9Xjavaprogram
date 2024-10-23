package OCT.ex_17102024_ifcondition_ifelse;

import java.util.Scanner;

public class Lab040
{
    public static void main(String[] args)
    {
        /*
        if else condition
        for 2 or more output
         */

        /*if (condition)
        {
            code to be executed if the condition is true
        }
        else if
        {
        code to be executed if the condition is true
        }
        else
        {
        code to be executed if the condition is true
        }*/

        Scanner Scanner=new Scanner(System.in);

        System.out.println("Enter the num1");
        int num1 =Scanner.nextInt();


        System.out.println("Enter the num2");
        int num2 =Scanner.nextInt();


        /*int num1 = 20;
        int num2 =20;*/

        /*
        conditions
        1. num1 > num2
        2. num2 > num1
        3. num1 == num2
         */

        if(num1 > num2) 
        {
            System.out.println("num1 > num2");
        }
        else if (num2 > num1)
        {
            System.out.println("num2 > num1");
        }
        else
        {
            System.out.println("num1 == num2");
        }
        Scanner.close();

        }

    }

