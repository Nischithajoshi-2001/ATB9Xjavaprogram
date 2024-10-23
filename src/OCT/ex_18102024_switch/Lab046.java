package OCT.ex_18102024_switch;

import java.util.Scanner;

public class Lab046
{
    public static void main(String[] args)
    {
        Scanner Scanner =new Scanner(System.in);
        System.out.println("Enter the number between 1-12");
        int month = Scanner.nextInt();

        switch (month)
        {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("NOv");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("The entered number is invalid");
                break;

        }

    }
}
