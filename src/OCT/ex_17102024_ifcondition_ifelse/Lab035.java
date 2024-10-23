package OCT.ex_17102024_ifcondition_ifelse;

import java.util.Scanner;

public class Lab035
{
    public static void main(String[] args)
    {

        /*if (condition)
        {
            code to be executed if the condition is true
        }*/
        Scanner Scanner=new Scanner(System.in);
         int age=Scanner.nextInt();

         //int age =21;

        if (age>=18) {
            System.out.println("Allowed to vote");
        }

            Scanner.close();



    }
}
