package OCT.ex_15102024_ternary_increment_decrement;

public class Lab027
{
    public static void main(String[] args)
    {
        int a= 10;

        System.out.println(++a + a++ + a++ );

        /*A=++a -> 11  -> a->11
           +
          B=a++ -> 11 -> a-> 12
           +
          C=a++ -> 12 -> a-> 13
         */


    }
}
