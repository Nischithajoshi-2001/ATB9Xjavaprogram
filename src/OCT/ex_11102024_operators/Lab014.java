package OCT.ex_11102024_operators;

public class Lab014
{
    public static void main(String[] args)
    {
        boolean a = true;
        boolean b = true;
        boolean c = true || false;

        System.out.println(c);
        System.out.println(!a);
        System.out.println(!!a);
        System.out.println(!!!a);
        System.out.println(!(10>20));
        System.out.println(!(10<20));
        System.out.println(!(10>=20));
        System.out.println(!!!!(30>90));

        /*
        OR gare condition          AND gate condition
        t||t= t;                    t&&T=t
        t||f =t;                    t&&f=f
        f||t =t;                    f&&t=f
        f||f =f;                    f&&f=f
         */

    }
}
