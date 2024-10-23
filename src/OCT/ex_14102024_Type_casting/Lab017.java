package OCT.ex_14102024_Type_casting;

public class Lab017
{
    public static void main(String[] args)
    {
        /*Type casting
        widening- Implicit , Explicit(losses)
        Narrowing -Implicit , Explicit
         */

        //widening -converting small data type into large data type
        byte a = 100;
        int b=a; //valid -> Implicit casting JVM
        int b1=(int)a; //valid Explicit casting user

        // Narrowing - converting large data type into small data type
        int q = 200;
        //byte w=q;  invalid JVM will not convert
        byte w =(byte)q; // valid user will convert and rest will be overflowed ot loss of data



        System.out.println(b1);
        System.out.println(w);

    }
}
