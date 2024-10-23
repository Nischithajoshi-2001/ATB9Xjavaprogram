package OCT.ex_16102024_taking_inputs;

public class Lab030
{
    public static void main(String[] args)
    {
        //Taking input
        // Arguments (In console)

        //int age = 40;
        int age = Integer.parseInt(args[0]);

        System.out.println(age>25? "Allowed to Goa": "Not allowed");

    }
}
