package OCT.ex_11102024_operators;

public class Lab015
{
    public static void main(String[] args)
    {
        int a=12;
        boolean b = !(a>10 || a<5);
        /* 12>10 = t
        12<5 = f
        t||f =t
        !t-f
         */

           System.out.println(b);

    }
}
