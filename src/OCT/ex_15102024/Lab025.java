package OCT.ex_15102024;

public class Lab025
{
    public static void main(String[] args)
    {
        int a= 10;
        System.out.println(a++ + ++a);

        //A ->a++ ->10 -> a=11
        // + ->
        // B=++a -> 11 -> a= 12
    }
}
