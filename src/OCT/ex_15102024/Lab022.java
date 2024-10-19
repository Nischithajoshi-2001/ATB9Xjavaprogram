package OCT.ex_15102024;

public class Lab022
{
    public static void main(String[] args)
    {
        /* If score is 90 or above ,grade will be "A"
           If score is between 80 and 89, grade will be "B"
           If score is between 70 and 79, grade will be "C"
           If score is between 60 and 69, grade will be "D"
           If score is below 60 , grade will be "F"
         */

        int score = 85;
        String grade =(score>=90)?"A" : (score>=80)? "B" : (score>+70)? "C" : (score >=60)? "D" :"F";

        System.out.println("Your grade=" +grade);

    }
}
