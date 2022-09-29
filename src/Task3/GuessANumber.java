package Task3;
import java.util.Random;
import java.util.Scanner;
import java.util.Scanner.*;


public class GuessANumber {
    private static int rnd_number;




    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess() {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        // Read user input


        //use hasNextInt to check if input is numeric,
        if (scanner.hasNextInt()) {
            // if so...
            //   Compare it with the random number
            int num = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Your number is: "+num);
            //   Let the user know the result of the comparison (was it the right number?)
                if (num == rnd_number) {
                    System.out.println("You got the number correct!");

                } else

                    //   Help the user by revealing wether the guess was lower or higher than the target number
                    if (num<rnd_number) System.out.println("Your number is lower");
                    if (num>rnd_number) System.out.println("Your number is higher");
                    System.out.println("You guessed wrong.");
                makeAGuess();


        }
        // if input was not numeric show an error message and call this method recursively
        else
            System.out.println("not an int lmao");
        makeAGuess();
    }










    }



