package OCT.ex_18102024_switch;

import java.util.Scanner;

public class Lab044
{
    public static void main(String[] args)
    {
        /*
        Web automation(i will ask the user which browser you want to use
        Chrome
        Firefox
        Edge
         */

        Scanner Scanner =new Scanner(System.in);
        System.out.println("Enter the browser here");
         String browser =Scanner.next();
        //browser = browser.toLowerCase();

        switch (browser)
        {
            case "Chrome":
                System.out.println("Starting the chrome browser");
                System.out.println("................");
                System.out.println("Executing the test cases");
                break;
            case "Firefox":
                System.out.println("Starting the Firefox browser");
                System.out.println("................");
                System.out.println("Executing the test cases");
                break;
            case "Edge":
                System.out.println("Starting the Edge browser");
                System.out.println("................");
                System.out.println("Executing the test cases");
                break;
            default:
                System.out.println("i have no idea which browser your looking for");
        }

        Scanner.close();

    }
}
