package OCT.ex_16102024_taking_inputs;

import java.util.Scanner;

public class Lab031
{
    public static void main(String[] args)
    {
        //Scanner class input
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = Scanner.nextInt();
        System.out.println(age>25? "Alloewd to Goa" : "Not allowed");

        Scanner.close();

    }
}
