package OCT.ex_16102024_taking_inputs;

import java.util.Scanner;

public class Lab032
{
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = Scanner.nextLine();

        System.out.println("Enter your age ");
        int age = Scanner.nextInt();

        System.out.println("Enter your salary");
        double salary = Scanner.nextDouble();

        System.out.println("\n User information");
        System.out.println("Name "+ name );
        System.out.println("Age "+ age);
        System.out.println("Salary" + salary);

        Scanner.close();

    }
}
