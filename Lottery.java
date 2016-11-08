import java.util.Scanner;

public class Lottery
{
    public static void main(String [] args)
    {
        double number1 = 400;
        double number2 = 400;
        double number3 = 400;
        double number4 = 400;
        double number5 = 400;
        double number6 = 400;

        Scanner input = new Scanner(System.in);

        while (number1 >= 49 | number1 <=1){
            System.out.println("Enter your first number (Between 1 and 49)");
            number1 = input.nextDouble(); }

        while (number2 >= 49 | number2 <=1){
            System.out.println("Enter your second number (Between 1 and 49)");
            number2 = input.nextDouble(); }  

        while (number3 >= 49 | number3 <=1){
            System.out.println("Enter your third number (Between 1 and 49)");
            number3 = input.nextDouble(); } 

        while (number4 >= 49 | number4 <=1){
            System.out.println("Enter your forth number (Between 1 and 49)");
            number4 = input.nextDouble(); } 

        while (number5 >= 49 | number5 <=1){
            System.out.println("Enter your fith number (Between 1 and 49)");
            number5 = input.nextDouble(); }   

        while (number6 >= 49 | number6 <=1){
            System.out.println("Enter your sixth number (Between 1 and 49)");
            number6 = input.nextDouble(); }       

        double random1 = Math.ceil(Math.random() * 49); 
        double random2 = Math.ceil(Math.random() * 49); 
        double random3 = Math.ceil(Math.random() * 49); 
        double random4 = Math.ceil(Math.random() * 49); 
        double random5 = Math.ceil(Math.random() * 49); 
        double random6 = Math.ceil(Math.random() * 49); 
        double bonusBall = Math.ceil(Math.random() * 49); 

        double eh = 30;

        int counter = 0;

        if (number1 == random1 | number2 == random1 | number3 == random1 | number4 == random1 | number5 == random1 | number6 == random1)
        {
            counter++;
        }

        if (number1 == random2 | number2 == random2 | number3 == random2 | number4 == random2 | number5 == random2 | number6 == random2)
        {
            counter++;
        }

        if (number1 == random3 | number2 == random3 | number3 == random3 | number4 == random3 | number5 == random3 | number6 == random3)
        {
            counter++;
        }

        if (number1 == random4 | number2 == random4 | number3 == random4 | number4 == random4 | number5 == random4 | number6 == random4)
        {
            counter++;
        }

        if (number1 == random5 | number2 == random5 | number3 == random5 | number4 == random5 | number5 == random5 | number6 == random5)
        {
            counter++;
        }

        if (number1 == random6 | number2 == random6 | number3 == random6 | number4 == random6 | number5 == random6 | number6 == random6)
        {
            counter++;
        }

        int bonus = 0;

        if (number1 == bonusBall | number2 == bonusBall | number3 == bonusBall | number4 == bonusBall | number5 == bonusBall | number6 == bonusBall)
        { System.out.println(bonusBall + " Matched! :) (BONUS BALL)");
            bonus++;
        }

        if (number4 == 21) //this is a cheat code to debug/test if the counter works.
        { 
            counter = 0;
            counter +=6;
            bonus++;
        }
        
        
        if (counter == 6)
        { System.out.println("6 of your numbers matched! You win £1,000,000");}

        else if (counter == 5 && bonus == 1)
        { System.out.println("5 of your numbers matched and you got the Bonus Ball You win £100,000");}

        else if (counter == 5)
        { System.out.println("5 of your numbers matched! You win £10,000");}

        else if (counter == 4)
        { System.out.println("4 of your numbers matched! You win £100");}

        else if (counter == 3)
        { System.out.println("3 of your numbers matched! You win £10");}

        else
        { System.out.println("LOL you get nothing. >:) (" + counter + " number(s) matched)");}

    }
}
