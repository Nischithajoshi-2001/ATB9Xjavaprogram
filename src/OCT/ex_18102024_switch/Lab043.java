package OCT.ex_18102024_switch;

import java.util.Scanner;

public class Lab043
{
    public static void main(String[] args)
    {
        /*
        Switch condition
        {
        `case statements
        `values must be of same type of expression`

        `case value1 : expression = value 1 ->`
        `statements
        `break;`

        `case value2 :`
        `Statements`
        `break; // break is optional`
        `default:`
        `break;`

         */

        Scanner Scanner =new Scanner(System.in);
        System.out.println("Enter the day from (1-7)");
        int day = Scanner.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrsday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No Idea, what day it is ");
                break;
        }

        System.out.println("End of the loop");
        Scanner.close();

    }
}
