package OCT.ex_16102024_taking_inputs;

import java.util.Scanner;

public class Lab033
{
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter your company name");
        String company_name = Scanner.nextLine();

        System.out.println("Enter your EXP");
        int EXP =Scanner.nextInt();

        System.out.println("Enter your Phone number");
        double Phone_number=Scanner.nextDouble();

        System.out.println("Company_name " + company_name);
        System.out.println("EXP" + EXP);
        System.out.println("Phone_number" + Phone_number);

        Scanner.close();

    }
}
