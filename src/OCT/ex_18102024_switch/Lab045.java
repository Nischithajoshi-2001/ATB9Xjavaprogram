package OCT.ex_18102024_switch;

import java.util.Scanner;

public class Lab045
{
    public static void main(String[] args)
    {
        Scanner Scanner =new Scanner(System.in);

        System.out.println("Enter the  num1");
        int num1 = Scanner.nextInt();

        System.out.println("Enter the num2");
        int num2 = Scanner.nextInt();

        System.out.println("Enter the method to calculate(+ - * /)");
        int c= Scanner.next().charAt(0);
        double result ;

        switch (c) {
            case '+' :
                result=num1+num2;
                System.out.println("The number entered is added" + num1 + "+" + num2 + "=" + result);
                break;
            case '-' :
                result=num1-num2;
                System.out.println("The number entered is subtracted " + num1 + "-"+ num2 +"="  +result);
                break;
            case '*':
                result=num1*num2;
                System.out.println("The number entered is multipied" + num1 + "*" + num2 + "=" + result);
                break;
            case '/':
                result=num1/num2;
                System.out.println("The number entered is divided " + num1 + "/" +num2 + "=" + result);
                break;
            default :
                System.out.println("The num entered in incorrect");
        }

    }
}
