import java.util.Scanner;

public class NumberGame {

    public static void main(String []args)
    {
        int randomNumber = (int)(Math.random()*100) + 1;

        System.out.println("Guess a number!");
       // System.out.println("Random Number: "+randomNumber);

        Scanner scanner = new Scanner(System.in);

        int i=0, turns=10;
        while(i<turns)
        {
            System.out.println("You have "+(turns-i)+" Turns left!");

            int guess = scanner.nextInt();
            System.out.println("Your guess was: "+guess);

            if(randomNumber == guess)
            {
                System.out.println("Random Number: "+randomNumber);
                System.out.println("Your guess: "+guess);

                System.out.println("Correct Answer!");
                break;
            }
            else if(randomNumber < guess)
            {
                System.out.println("Your guess is bigger than the Random Number!");
            }
            else
            {
                System.out.println("Your guess is smaller than the Random Number!");
            }
            i++;
        }
    }

}
